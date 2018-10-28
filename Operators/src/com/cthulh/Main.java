package com.cthulh;

public class Main {

    public static void main(String[] args) {
        // assignment = and addition +
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int prevResult = result;

        // subtraction -
        result = result - 1;
        System.out.println(prevResult + " - 1 = " + result);

        prevResult = result;

        // multiplication *
        result = result * 10;
        System.out.println(prevResult + " * 10 = " + result);

        prevResult = result;

        // division /
        result = result / 5;
        System.out.println(prevResult + " / 5 = " + result);

        prevResult = result;

        // remainder %
        result = result % 3;
        System.out.println(prevResult + " % 3 = " + result);

        prevResult = result;

        // iteration
        result++;
        System.out.println("result++ equals " + result);
        result--;
        System.out.println("result--  equals " + result);
        // abbrev
        result += 2;
        System.out.println("result +=2 equals " + result);
        result *= 2;
        System.out.println("result *=2 equals " + result);
        result -= 2;
        System.out.println("result -=2 equals " + result);
        result /= 2;
        System.out.println("result /=2 equals " + result);
        System.out.println("------------------" );

        // ==
        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an Alien!");
        // !=
        int topScore = 81;
        if (topScore == 100)
            System.out.println("You got the high score!");
        if (topScore != 100)
            System.out.println("You didn't get 100 score!");
        // < > <= >= &&
        if (topScore > 100)
            System.out.println("Your score is over 100!");
        if (topScore <= 100)
            System.out.println("Your score less or equal 100!");
        if (topScore >= 100)
            System.out.println("Your score is equal or over 100!");

        int secondTopScore = 96;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less then 100");
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true!");


        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        // Challenge

        // 1. Create a double var with val 20
        double firstNum = 20d;
        // 2. Create a second double var with val 80
        double secondNum = 80d;
        // 3. Add both numbers up and multiply by 25
        double sum = (firstNum + secondNum)*25;
        System.out.println("Sum = " + sum);
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        double reminderNum = sum % 40;
        System.out.println("Reminder = " + reminderNum);
        System.out.println("Limit = " + 20);
        // 5. Write an if statement that displays a message "Total was over the limit"
        // if the remaining total (#4) is equal to 20 or less
        if (reminderNum <= 20)
            System.out.println("Total was over the limit");
    }
}
