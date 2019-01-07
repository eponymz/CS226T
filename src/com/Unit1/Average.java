/*
Using NetBeans, create a Java program called Average.java.
The program should use the Scanner class to get 4 integers from the user and store them in variables.
The program should calculate the average of the 6 numbers as a floating point.
Output all of the original input and the calculated average in the Command window.
The code is expected to be commented and user-friendly.
*/
package com.Unit1;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    /*
     * 'main' method of class
     * Kept this way for better organization
     */
    public static void main(String[] args) {
        getInput();
    }

    /**
     * initially planned on having methods for input and output be separate
     * decided for this it would be best kept in one
     */
    private static void getInput() {
        // sets input as an instance of scanner to grab input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter four integers:");
        /*
         * variables used in math logic below
         * n is length of array (finite at 4 per instruction)
         * sum is used in calculating the average later on
         */
        int n = 4, sum = 0;
        int[] userInputList = new int[4];
        for (int i = 0; i < 4; i++) {
            userInputList[i] = input.nextInt();
            sum = sum + userInputList[i];
        }
        // flip to string for easier interpolation when printing to user
        String userListToString = Arrays.toString(userInputList);
        System.out.println(String.format("Here's what I have for your entries:\n %s",
                userListToString));
        /*
         * calculate the average
         * set as float type in order to capture more exact values
         */
        float avg = (float) sum / n;
        System.out.println(String.format("And here is the average for those entries:\n %s",
                avg));
    }
}
