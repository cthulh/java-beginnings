package com.cthulh;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(157);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double result = -1;

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            result = (feet*12 + inches)*2.54;
        }
        System.out.println(result);
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        double result = -1;

        if (inches >= 0) {
            result = calcFeetAndInchesToCentimeters((int)inches/12, inches%12);
        }

        return result;
    }
}
