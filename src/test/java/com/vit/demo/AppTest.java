package com.vit.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAdd() {
        int expected = 6;
        int actual = App.add(2, 3);

        assertEquals(expected, actual);
        System.out.println("TEST PASSED: App.add(2, 3) returned 5.");
    }
}