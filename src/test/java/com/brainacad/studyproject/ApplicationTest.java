package com.brainacad.studyproject;

import com.brainacad.studyproject.service.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ApplicationTest {

    private File file;

    @Before
    public void setUp() {
        file = new File("hello.txt");
    }

    @After
    public void tearDown() {
        file.delete();
    }

    @Ignore
    @Test
    public void testHello() {

        System.out.println("Test"); // stub

        try (
             FileOutputStream fos = new FileOutputStream(file);
             PrintStream out = new PrintStream(fos);
             FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)
        ) {
            // arrange
            System.setOut(out);

            // act
            Application.main(null);

            //assert
            assertEquals("Unexpected output", "Hello!", br.readLine());

        } catch (IOException e) {
            fail("IO Problems");
        }
    }
}
