package AgeAndDiscount;

import java.util.Scanner;

public class AgeAndDiscount {
    public static void main(String[] args) {

        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int Age = scanner.nextInt();
        if (Age >= 65) {
            System.out.println("Your discount is 10%!");
        }
        else if (Age <= 18) {
            System.out.println("Your discount is 25%!");
        }
        else {
            System.out.println("Your discount is 5%!");
        }

    }
}
