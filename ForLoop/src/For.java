public class For {
    public static void main(String[] args) {
        System.out.println(calculateInterest(10_000, 2.0));
        System.out.println(calculateInterest(10_000, 3.0));
        System.out.println(calculateInterest(10_000, 4.0));
        System.out.println(calculateInterest(10_000, 5.0));
        System.out.println("-------");
        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("-------");
        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.4f",calculateInterest(10_000, i)));
        }
        System.out.println("-------");
        int count = 0;
        for (int i = 47; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " / " + count);
                count++;
            }
            if (count == 3) break;
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount*interestRate/100);
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
