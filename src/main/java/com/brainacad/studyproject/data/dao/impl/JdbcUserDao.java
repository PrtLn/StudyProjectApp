package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.core.ConnectionManager;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.brainacad.studyproject.data.domain.Role.ADMIN;
import static com.brainacad.studyproject.data.domain.Role.USER;

public class JdbcUserDao implements UserDao {

    private ConnectionManager connectionManager
            = ConnectionManager.getInstance();

    @Override
    public User getUserByName(String username) {

        Connection connection = connectionManager.getConnection();
        User user = null;
        try {
            PreparedStatement statement =
                    connection.prepareStatement("select * from users where username like ?");
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet != null) {
                user = new User();
                while (resultSet.next()) {
                    user.setId(resultSet.getInt("user_id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    user.setRole(resultSet.getInt("role_id") == 1 ? ADMIN : USER);
                }
            }
            connectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
