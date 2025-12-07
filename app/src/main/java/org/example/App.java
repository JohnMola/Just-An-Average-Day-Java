package org.example;

public class App {

    public static void main(String[] args) {
         ArrayMath math = new ArrayMath();
        int[] nums = {5, 2, 9, 1, 7};

        System.out.println("Maximum (for loop): " + math.maximumUsingForLoop(nums));
        System.out.println("Minimum (for loop): " + math.minimumUsingForLoop(nums));
        System.out.println("Sum (for loop): " + math.sumUsingForLoop(nums));
        System.out.println("Average (for loop): " + math.averageUsingForLoop(nums));

        System.out.println("Maximum (stream): " + math.maximumUsingStream(nums));
        System.out.println("Minimum (stream): " + math.minimumUsingStream(nums));
        System.out.println("Sum (stream): " + math.sumUsingStream(nums));
        System.out.println("Average (stream): " + math.averageUsingStream(nums));
    }
}
