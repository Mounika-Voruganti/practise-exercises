package com.tw.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {
    @Test
    void shouldAddTwoNumbers1And3AndReturn4() {
        MathOperation mathOperation = new MathOperation();
        assertEquals(4,mathOperation.add(1,3));

    }

    @Test
    void shouldSubtractNumbers4And3AndReturn1() {
        MathOperation mathOperation = new MathOperation();
        assertEquals(1,mathOperation.subtract(4,3));
    }
}
