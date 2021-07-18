package com.sda.training.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {
    @Before
    public void setUp() {
        System.out.println("We are inside setup");
    }
    @After
    public void tearDown() {
        System.out.println("We are inside tear");
}
    @Test
    public void testFirst() {
        System.out.println("We are inside First test method");
    }
    @Test
    public void testSecond() {
        System.out.println("We are insite Second test method");
    }

}
