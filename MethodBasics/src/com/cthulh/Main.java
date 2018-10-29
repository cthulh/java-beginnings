package com.cthulh;

public class Main {

    public static void main(String[] args) {

        String player1 = "Bob";
        String player2 = "Steve";
        String player3 = "Mick";
        String player4 = "Rupert";
        int score1 = 1500;
        int score2 = 900;
        int score3 = 400;
        int score4 = 50;

        displayFinalScore(calculateScore(true, 800, 5, 100));
        displayFinalScore(calculateScore(true, 10000, 8, 200));
        printout("---------------");
        displayHighScorePosition(player1, calculateHighScorePosition(score1));
        displayHighScorePosition(player2, calculateHighScorePosition(score2));
        displayHighScorePosition(player3, calculateHighScorePosition(score3));
        displayHighScorePosition(player4, calculateHighScorePosition(score4));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompl, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompl * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void printout(String message){

        System.out.println(message);

    }

    public static void displayFinalScore(int highScore){

        printout("Your final score was " + highScore);

    }


    // Challenge

    public static void displayHighScorePosition(String player, int position) {

        printout(player + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int highScore) {

        int position = 4;

        if (highScore >= 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }

        return position;

    }

}
