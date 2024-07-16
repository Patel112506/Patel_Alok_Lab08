import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Testing getNonZeroLenString
        // String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        // System.out.println("Your name is: " + name);

        // Testing getInt
        //int age = SafeInput.getInt(in, "Enter your age");
        //System.out.println("Your age is: " + age);

        // Testing getDouble
        double salary = SafeInput.getDouble(in, "Enter your salary");
        System.out.println("Your salary is: " + salary);

        // Testing getRangedInt
        //int day = SafeInput.getRangedInt(in, "Enter the day of the month", 1, 31);
        //System.out.println("The day of the month is: " + day);

        // Testing getRangedDouble
        //double grade = SafeInput.getRangedDouble(in, "Enter your grade", 0.0, 100.0);
        //System.out.println("Your grade is: " + grade);

        // Testing getYNConfirm
        //boolean confirm = SafeInput.getYNConfirm(in, "Do you agree?");
        //System.out.println("Your response is: " + (confirm ? "Yes" : "No"));

        // Testing getRegExString
        //String ssn = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        //System.out.println("Your SSN is: " + ssn);
    }
}

