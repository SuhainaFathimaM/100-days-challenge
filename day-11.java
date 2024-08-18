import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        do {

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();


            System.out.print("Enter an operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is undefined.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Modulus by zero is undefined.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

            System.out.println(); 

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}
