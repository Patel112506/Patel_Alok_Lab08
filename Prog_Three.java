import java.util.Scanner;

public class Prog_Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);
        int day = getValidDay(in, month);
        int hour = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);
        System.out.println("You were born on: " + year + "-" + month + "-" + day + " at " + hour + ":" + minute);
    }

    private static int getValidDay(Scanner in, int month) {
        int day = 0;
        switch (month) {
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 29);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31);
        }
        return day;
    }
}

