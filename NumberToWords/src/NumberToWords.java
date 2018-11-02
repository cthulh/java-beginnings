public class NumberToWords {

    public static void main(String[] args) {
        //System.out.println(reverse(10012));
        numberToWords(10);
    }

    public static void numberToWords(int number) {
        String numberToWord = "";
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            for (int i = reverse(number); i > 0; i /= 10) {
                int digit = i % 10;
                switch(digit) {
                    case 0:
                        numberToWord = "Zero";
                        break;
                    case 1:
                        numberToWord = "One";
                        break;
                    case 2:
                        numberToWord = "Two";
                        break;
                    case 3:
                        numberToWord = "Three";
                        break;
                    case 4:
                        numberToWord = "Four";
                        break;
                    case 5:
                        numberToWord = "Five";
                        break;
                    case 6:
                        numberToWord = "Six";
                        break;
                    case 7:
                        numberToWord = "Seven";
                        break;
                    case 8:
                        numberToWord = "Eight";
                        break;
                    case 9:
                        numberToWord = "Nine";
                        break;
                }
                if (getDigitCount(number) == getDigitCount(reverse(number))){
                    System.out.println(numberToWord);
                } else {
                    System.out.println(numberToWord);
                    for (int k = getDigitCount(number) - getDigitCount(reverse(number)); k > 0; k--) {
                        System.out.println("Zero");
                    }
                }

            }
        }
    }

    public static int reverse(int number) {
        // reverse a number
        int reversed = 0;
        for (int i = number; i > 0; i /= 10) {
            //System.out.println(i % 10);
            reversed += i % 10;
            if (i >=10) reversed *= 10;
            //System.out.println("reversed number: " + reversed);
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        // count digits in a number
        int digitCount = 0;
        for (int i = number; i >0; i /= 10) {
            digitCount++;
        }
        return digitCount;
    }

}
