public class SecondsAndMinutes {

    public static void main(String[] args) {

    }

    public static String getDurationString(int minutes, int seconds){
        String errorMessage = "Invalid value";
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            String durationMessage = "";
            int hours = minutes/60;
            int reminderMinutes = minutes % 60;
            String showHours = hours < 10? "0" + hours: "" + hours;
            String showMinutes = reminderMinutes < 10? "0" + reminderMinutes: "" + reminderMinutes;
            String showSeconds = seconds < 10? "0" + seconds: "" + seconds;
            durationMessage += showHours + "h "
                            + showMinutes + "m "
                            + showSeconds + "s";
            return durationMessage;
        } else {
            return errorMessage;
        }
    }

}
