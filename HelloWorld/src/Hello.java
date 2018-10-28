public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int myFirstNumber = (10 + 5)*(2 + 2);
        int mySecondNumber = 1;
        int myThirdNumber = myFirstNumber + mySecondNumber*2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myThousandLessTotal = 1000 - myTotal;

        System.out.println(myFirstNumber);
        System.out.println("----");
        System.out.println(myTotal);
        System.out.println(myThousandLessTotal);
    }
}
