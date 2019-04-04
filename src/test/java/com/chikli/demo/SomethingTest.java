package com.chikli.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SomethingTest {
    @Test
    void testIt() {
        final Something s1 = new Something();
        final Something s2 = new Something();

        assertThat(s1.message()).isEqualTo(s2.message());
    }
}