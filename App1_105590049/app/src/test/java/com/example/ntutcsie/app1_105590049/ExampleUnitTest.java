package com.example.ntutcsie.app1_105590049;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    getGrade gg = new getGrade();
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals("grade = 'A'", gg.letterGrade(90));
        assertEquals("grade = 'B'", gg.letterGrade(80));
        assertEquals("grade = 'C'", gg.letterGrade(70));
        assertEquals("grade = 'D'", gg.letterGrade(60));
        assertEquals("grade = 'F'", gg.letterGrade(59));
        assertEquals("grade = 'X'", gg.letterGrade(-1));
        assertEquals("grade = 'X'", gg.letterGrade(101));
    }
}