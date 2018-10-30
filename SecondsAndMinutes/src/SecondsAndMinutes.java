public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(61,1));
    }

    public static String getDurationString(int minutes, int seconds){
        String errorMessage = "Invalid value";
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
            return errorMessage;
        }
    }

    public static String twoSlotNumPresent(int num) {
        String showNum = num < 10? "0" + num: "" + num;
        return showNum;
    }

}
