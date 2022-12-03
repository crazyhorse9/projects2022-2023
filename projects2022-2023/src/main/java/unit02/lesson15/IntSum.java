package unit02.lesson15;

public class IntSum {
    public static int sum(int value) {
        if (value < 1) {
            return 0;
        }
        int result = 0;
        for(int i = 0; i <= value; i++){
            result = result + i;
        }
        return result;
    }
}