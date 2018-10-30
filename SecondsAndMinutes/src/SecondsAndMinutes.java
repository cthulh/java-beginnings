public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61,1));
        System.out.println(getDurationString(3661));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            String durationMessage = "";
            int hours = minutes/60;
            int reminderMinutes = minutes % 60;
            String showHours = twoSlotNumPresent(hours);
            String showMinutes = twoSlotNumPresent(reminderMinutes);
            String showSeconds = twoSlotNumPresent(seconds);
            durationMessage += showHours + "h "
                            + showMinutes + "m "
                            + showSeconds + "s";
            return durationMessage;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int reminderSeconds = seconds % 60;
            return getDurationString(minutes,reminderSeconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String twoSlotNumPresent(int num) {
        String showNum = num < 10? "0" + num: "" + num;
        return showNum;
    }

}
