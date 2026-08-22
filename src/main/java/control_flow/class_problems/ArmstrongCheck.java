package control_flow.class_problems;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int origNumber = number;
        int sum = 0;

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp = temp / 10;
        }

        if (sum == origNumber) {
            System.out.println(origNumber + " is an Armstrong number.");
        } else {
            System.out.println(origNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
