public class AllFactors {

    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            String message = "";

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    message += i + " ";
                }
            }
            System.out.println(message);
        }
    }

}
