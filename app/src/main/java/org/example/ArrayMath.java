package org.example;

import java.util.Arrays;

public class ArrayMath {
    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }


public int minimumUsingForLoop(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }
    }
    return min;
}

public int sumUsingForLoop(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
    }
    return sum;
}

public int averageUsingForLoop(int[] nums) {
    int sum = sumUsingForLoop(nums);
    return sum / nums.length;
}

public int maximumUsingStream(int[] nums) {
    return Arrays.stream(nums).max().getAsInt();
}

public int minimumUsingStream(int[] nums) {
    return Arrays.stream(nums).min().getAsInt();
}

public int sumUsingStream(int[] nums) {
    return Arrays.stream(nums).sum();
}

public int averageUsingStream(int[] nums) {
    return (int) Arrays.stream(nums).average().getAsDouble();
}
}
