package com.cthulh;

public class Main {

    public static void main(String[] args) {

        // int has width of 32
        int myMinVal = -2_147_483_648;
        int myMaxVal = 2_147_483_647;
        int myTotal = myMinVal/2;
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByteVal = -128;
        byte myMaxByteVal = 127;
        // byte myNewByteVal = myMinByteVal/2; creates an int !!!
        byte myNewByteVal = (byte) (myMinByteVal/2);
        System.out.println("myNewByteVal = " + myNewByteVal);

        // short has a width of 16
        short myMinShortVal = -32_768;
        short myMaxShortVal = 32_767;

        // long has a width of 64
        long myLongVal = 100L;

        System.out.println("-----");
        // Challange:

        // 1. Create a byte var and set it to any valid byte number
        byte chalByteVal = 5;
        System.out.println("byte = " + chalByteVal);

        // 2. Create a short var and set it to any valid short number
        short chalShortVal = 10_000;
        System.out.println("short = " + chalShortVal);

        // 3. Create an int var and set it to any valid int number
        int chalIntVal = 10_000;
        System.out.println("int = " + chalIntVal);

        // 4. Create a var of type long, and make it equal to 5000 + 10 times the sum of the byte, plus the short plus the int
        long chalLongVal = 5000 + 10 *(chalByteVal + chalShortVal + chalIntVal);
        System.out.println("type long total = " + chalLongVal);

        // 5. Create a short cast total val
        short shortTotal = (short) (5000 + 10 *(chalByteVal + chalShortVal + chalIntVal));
        System.out.println("type short total = " + chalLongVal);
    }
}
