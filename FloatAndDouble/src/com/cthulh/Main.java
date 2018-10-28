package com.cthulh;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntVal = 5 / 3; // does not retain the remainder
        // width of float = 32 (4 bytes)
        float myFloatVal = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleVal = 5d / 3d;

        System.out.println("myIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println("myDoubleVal = " + myDoubleVal);

        System.out.println("----");

        // Challenge:

        // 1. Create a var to store the number of pounds
        double weightInPounds = 16d;
        System.out.println("Weight in pounds = " + weightInPounds);
        // 2. Calculate the number of kgs for the number above and store in a variable
        double weightInKgs = weightInPounds * 0.45359237d;
        // 3. Print it out
        System.out.println("Weight in kgs = " + weightInKgs);
        //
        // Notes: 1 pound is equal to 0.45359237 kgs


    }
}
