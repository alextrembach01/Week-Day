import java.util.Scanner;

public class NumbersComparison {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first number.");
        int firstNumber = scanner.nextInt();
        System.out.println("Input your second number.");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber +" > "+ secondNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(firstNumber +" < "+ secondNumber);
        }
        else {
            System.out.println(firstNumber +" = "+ secondNumber);
        }


    }
}
