package br.com.matsumura.TDD_Software.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    private SimpleMath math;

    @BeforeEach
    void setUp() {
        math = new SimpleMath();
    }

    @Test
    @DisplayName("Teste de Soma (8+2 =10)")
    void Should_sum_8_plus_2_and_return_10(){

        double actual = math.sum(8D,2D);

        assertEquals(10D, actual);
    }

    @Test
    void Should_divide_2Number_and_Return_actual_value() {

        double actual = math.divide(8D, 2D);

        assertEquals(4D, actual);
    }

    @Test
    void Should_divide_By_Zero_and_Return_ArithmeticException() {

        var expectedMessage = "Division by zero";

        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            math.divide(8D, 0D);
        });

        assertEquals(expectedMessage, actual.getMessage());
    }

    @Test
    @DisplayName("Teste de subtração (8-2 =6)")
    void Should_subtract_8_minus_2_and_return_6(){

        double actual = math.subtract(8D, 2D);

        assertEquals(6D, actual);
    }

    @Test
    @DisplayName("Teste de multiplicação (8*2 =16)")
    void Should_multiply_8_times_2_and_return_16(){

        double actual = math.multiply(8D, 2D);

        assertEquals(16D, actual);
    }


}