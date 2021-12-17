import java.util.Scanner;

public class WeekDay {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number of the week day:");
        int numDay = scanner.nextInt();
        if (numDay == 1) {
            System.out.println("Monday");
        }
        else if (numDay == 2) {
            System.out.println("Tuesday");
        }
        else if (numDay == 3) {
            System.out.println("Wednesday");
        }
        else if (numDay == 4) {
            System.out.println("Thursday");
        }
        else if (numDay == 5) {
            System.out.println("Friday");
        }
        else if (numDay == 6) {
            System.out.println("Saturday");
        }
        else if (numDay == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Wrong number! Please input number from 1 to 7.");
        }

    }
}
