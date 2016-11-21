package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;

public interface CrudDao<E> {

    Collection<User> getAll();

    E get(int id);

    int add(E entity);

    boolean delete(int id);

    boolean update(E entity);
}
