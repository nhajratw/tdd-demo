package com.chikli.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SomethingTest {
    @Test
    public void testIt() {
        Something s1 = new Something();
        Something s2 = new Something();

        assertThat(s1.message(), is(s2.message()));
    }
}