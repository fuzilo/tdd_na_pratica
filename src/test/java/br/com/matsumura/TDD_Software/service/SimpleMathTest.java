package br.com.matsumura.TDD_Software.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void sum(){
        SimpleMath math = new SimpleMath();

        double actual = math.sum(8D,2D);


        assertEquals(10D, actual);
    }
}