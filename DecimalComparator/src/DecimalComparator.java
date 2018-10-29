public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean areEqualDec = false;

        int comparable1 = (int)(num1 * 1000d);
        int comparable2 = (int)(num2 * 1000d);
        System.out.println(comparable1 + " , " + comparable2);
        if (comparable1 == comparable2) areEqualDec = true;

        return areEqualDec;
    }

}
