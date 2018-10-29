public class BarkingDog {

    public static void main(String[] args) {

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean ifWakeUp = false;

        if (barking && hourOfDay >= 0 && hourOfDay <= 23) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                ifWakeUp = true;
            }
        }

        return ifWakeUp;

    }

}
