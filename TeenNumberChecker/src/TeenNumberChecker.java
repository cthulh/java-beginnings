public class TeenNumberChecker {

    public static void main(String[] args) {

    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean isTeen = false;

        if ((num1 >= 13 && num1 <=19) || (num2 >= 13 && num2 <=19) || (num3 >= 13 && num3 <=19)) isTeen = true;

        return isTeen;
    }

}
