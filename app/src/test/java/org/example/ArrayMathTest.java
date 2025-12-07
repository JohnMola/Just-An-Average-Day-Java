package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMathTest {
    ArrayMath math = new ArrayMath();
    int[] nums = {5, 2, 9, 1, 7};

    @Test
    void testMaximumUsingForLoop() {
        assertEquals(9, math.maximumUsingForLoop(nums));
    }

    @Test
    void testMinimumUsingForLoop() {
        assertEquals(1, math.minimumUsingForLoop(nums));
    }

    @Test
    void testSumUsingForLoop() {
        assertEquals(24, math.sumUsingForLoop(nums));
    }

    @Test
    void testMaximumUsingStream() {
        assertEquals(9, math.maximumUsingStream(nums));
    }

    @Test
    void testMinimumUsingStream() {
        assertEquals(1, math.minimumUsingStream(nums));
    }

    @Test
    void testSumUsingStream() {
        assertEquals(24, math.sumUsingStream(nums));
    }

    @Test
    void testAverageUsingStream() {
        assertEquals(4, math.averageUsingStream(nums));
    }

}
