package com.cthulh;

public class Main {

    public static void main(String[] args) {
	    int switchVal = 1;

	    switch(switchVal) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchVal);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char letter = 'A';

        switch(letter) {
            case 'A':
                System.out.println("Found character A");
                break;
            case 'B':
                System.out.println("Found character B");
                break;
            case 'C':
                System.out.println("Found character C");
                break;
            case 'D':
                System.out.println("Found character D");
                break;
            case 'E':
                System.out.println("Found character E");
                break;
            default:
                System.out.println("Not found neither of the following letters: A, B, C, D ,E");
                break;
        }

        String month = "FEB";

        switch(month.toLowerCase()) {
            case "dec":
            case "jan":
            case "feb":
                System.out.println("Its winter");
                break;
            default:
                System.out.println("Its not winter");
        }
    }




}
