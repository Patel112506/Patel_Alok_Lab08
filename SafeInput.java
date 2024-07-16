import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }
    public static int getInt (Scanner pipe, String prompt) {
        int retInt = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!valid);
        return retInt;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!valid);
        return retDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer within the range.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!valid);
        return retInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                if (retDouble >= low && retDouble <= high) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a double within the range.");
                }
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!valid);
        return retDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        boolean valid = false;
        boolean retVal = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                retVal = true;
                valid = true;
            } else if (response.equalsIgnoreCase("N")) {
                retVal = false;
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!valid);
        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a matching pattern.");
            }
        } while (!valid);
        return response;
    }
        /**
         * Prints a pretty header with the message centered within 60 characters wide.
         * @param msg the message to be centered in the header
         */
        public static void prettyHeader(String msg) {
            final int WIDTH = 60;
            int msgLength = msg.length();
            int totalPadding = WIDTH - msgLength - 6; // 3 stars on each side
            int padding = totalPadding / 2;
            int remainingPadding = totalPadding % 2; // In case the padding is not even

            // Top border
            for (int i = 0; i < WIDTH; i++) {
                System.out.print("*");
            }
            System.out.println();

            // Centered message
            System.out.print("***");
            for (int i = 0; i < padding; i++) {
                System.out.print(" ");
            }
            System.out.print(msg);
            for (int i = 0; i < padding + remainingPadding; i++) {
                System.out.print(" ");
            }
            System.out.println("***");

            // Bottom border
            for (int i = 0; i < WIDTH; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
}