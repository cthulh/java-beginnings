public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-771177));
    }

    private static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int tempVal = (number > 0)? number : -number;
        int loopCount = 0;
        System.out.println("Initial value of number: " + tempVal);
        while (tempVal > 0) {
            loopCount++;
            System.out.println("--------- LOOP " + loopCount + " ---------");
            reversedNum += tempVal % 10;
            tempVal -= tempVal % 10;
            System.out.println("reversed: " + reversedNum + " | number: " + tempVal);
            if (tempVal == 0) break;
            reversedNum *= 10;
            tempVal /= 10;
            System.out.println("reversed: " + reversedNum + " | number: " + tempVal);
        }

        return reversedNum == ((number > 0)? number : -number);
    }

}
