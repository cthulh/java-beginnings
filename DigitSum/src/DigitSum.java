public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(0));
    }

    private static int sumDigits(int number) {
        System.out.println("-----");
        int sum = 0;
        if (number >= 10) {
            while(number >= 1){
                sum+= number % 10;
                System.out.println("Sum: " + sum + " | number: " + number);
                number = number / 10;
                System.out.println("Dividing number by 10 results in: " + number);
            }
        } else {
            return -1;
        }
        System.out.println("---------------------The final sum: " + sum);
        return sum;
    }

}
