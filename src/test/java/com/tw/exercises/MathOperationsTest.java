package com.tw.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {
    @Test
    void shouldVerifyAddOperationAndReturn4WhenGiven1And3() {
        MathOperation mathOperation = new MathOperation();
        assertEquals(4,mathOperation.add(1,3));

    }
}
