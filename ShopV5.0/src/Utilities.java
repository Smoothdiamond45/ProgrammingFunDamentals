public class Utilities {

    public static double toTwoDecimalPlaces(double number) {
        return (int) (number * 100) / 100.0;
    }


    public static boolean YNtoBoolean(char charToConvert) {
        return ((charToConvert == 'y') || (charToConvert == 'Y'));
    }

}