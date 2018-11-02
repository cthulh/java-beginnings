public class PerfectNumber {

    public static void main(String[] args) {
        isPerfectNumber(6);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumOfDivs = 0;
        for (int i = 1; i < number; i++) {
            System.out.println(i);
            if (number % i == 0) sumOfDivs += i;
        }

        return number == sumOfDivs;
    }

}
