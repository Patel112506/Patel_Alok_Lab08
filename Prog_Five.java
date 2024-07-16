import java.util.Scanner;

public class Prog_Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String ucMNumber = SafeInput.getRegExString(in, "Enter your UC M number", "^(M|m)\\d{8}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");
        System.out.println("SSN: " + ssn);
        System.out.println("UC M Number: " + ucMNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
