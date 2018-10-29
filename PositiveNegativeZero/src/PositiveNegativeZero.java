public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNum(5);
        checkNum(-100);
        checkNum(0);
    }

    public static void checkNum(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }


}
