public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false,35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            // in summer, cats play in temp 25 - 45
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            // not in summer, cats play in temp 25 - 35
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }
}
