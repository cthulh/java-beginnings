public class SharedDigit {

    public static void main(String[] args) {
        hasSharedDigit(1234, 5647);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        //if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        for (int i = num1; i > 0; i /= 10) {
            int lastDigitNum1 = i % 10;
            System.out.println("-----");
            System.out.println("loop 1 -- " + lastDigitNum1);
            for (int k = num2; k > 0; k /= 10) {
                int lastDigitNum2 = k % 10;
                System.out.println("  -- loop 2 -- " + lastDigitNum2);
                if (lastDigitNum1 == lastDigitNum2) return true;
            }
        }

        return false;
    }

}
