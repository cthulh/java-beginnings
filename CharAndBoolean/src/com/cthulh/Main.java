package com.cthulh;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
	    char myChar = 'D'; // one character
        char myCharTwo = '2'; // one character
        char myCharThree = 'x'; // one character
        char myCharFour = '&'; // one character

        // using UNICODE notation

        char myCharUni = '\u00A9';
        System.out.println(myCharUni);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        // Challenge

        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a var of type char and assign it the unicode value for that symbol
        char registeredSym = '\u00AE';
        // 3. Display it on screen
        System.out.println(registeredSym);
    }
}
