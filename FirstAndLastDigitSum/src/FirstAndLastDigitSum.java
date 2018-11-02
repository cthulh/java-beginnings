public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        sumFirstAndLastDigit(123);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-222);
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int lastDigit = number % 10;
        int firstDigit = 0;

        for (int i = number; i > 0; i /= 10) {
            System.out.println("number: " + i);
            if (i < 10 ) firstDigit = i;
        }
        System.out.println("firstDigit: " + firstDigit + " | lastDigit: " + lastDigit);
        return firstDigit + lastDigit;
    }
}
