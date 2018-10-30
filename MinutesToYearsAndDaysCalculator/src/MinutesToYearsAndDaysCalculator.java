public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        String errorMessage = "Invalid Value";
        if (minutes >= 0) {
            String printMessage = minutes + " min = ";
            long days = minutes / (60*24);
            long years = days / 365;
            days = days % 365;
            printMessage += years + " y and " + days + " d";
            System.out.println(printMessage);
        } else {
            System.out.println(errorMessage);
        }
    }
}
