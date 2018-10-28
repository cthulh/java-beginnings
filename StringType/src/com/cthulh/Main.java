package com.cthulh;

public class Main {

    public static void main(String[] args) {

	    // String data type
        String myStr = "This is a String.";
        System.out.println(myStr);
        myStr = myStr + " And this is more.";
        System.out.println(myStr);
        myStr = myStr + " \u00AE 2015.";
        System.out.println(myStr);

        // Numbers and strings
        String numberStr = "20.55";
        numberStr = numberStr + "49.95";
        System.out.println(numberStr);

        String lastStr = "10";
        int myInt = 50;
        lastStr = lastStr + myInt;
        System.out.println(lastStr);

        double dblNum = 120.47;
        lastStr = lastStr + dblNum;
        System.out.println(lastStr);
    }
}
