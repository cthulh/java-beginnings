public class WhileLoop {

    public static void main(String[] args) {

        int count = 1;

        while(count != 6) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("----");
        count = 1;

        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("----");
        count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while(count != 6);


        System.out.println("----");

        int number = 4;
        int finishNumber = 20;
        int evenCounter = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) continue;
            evenCounter++;
            System.out.println("Even number: " + number + " | Even counter: " + evenCounter);
            if (evenCounter == 5) break;
        }
        System.out.println("Total number of even numbers found: " + evenCounter);

    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
