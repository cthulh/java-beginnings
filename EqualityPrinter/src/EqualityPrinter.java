public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
    public static void printEqual(int x, int y, int z) {

        String errorMessage = "Invalid Value";
        String equalMessage = "All numbers are equal";
        String notEqualMessage = "Neither all are equal or different";

        if (x >= 0 && y >= 0 && z >= 0) {
            if ( x == y && y == z) {
                System.out.println(equalMessage);
            } else {
                System.out.println(notEqualMessage);
            }
        } else {
            System.out.println(errorMessage);
        }
    }
}
