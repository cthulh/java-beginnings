public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(0.5));
        System.out.println(area(5,4));
    }

    public static double area(double radius) {
        if (radius >= 0) {
            return 3.141592654 * radius * radius;
        } else {
            return -1;
        }
    }

    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            return x * y;
        } else {
            return -1;
        }
    }
}
