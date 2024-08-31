import java.util.Scanner;

public class BitwiseShiftWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Left Shift (<<)");
        System.out.println("2. Right Shift (>>)");
        System.out.println("3. Logical Right Shift (>>>)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        int result = 0;

        switch (choice) {
            case 1: // Left Shift
                System.out.print("Enter the shift amount: ");
                int shiftAmount = scanner.nextInt();
                result = num << shiftAmount;
                break;
            case 2: // Right Shift
                System.out.print("Enter the shift amount: ");
                shiftAmount = scanner.nextInt();
                result = num >> shiftAmount;
                break;
            case 3: // Logical Right Shift
                System.out.print("Enter the shift amount: ");
                shiftAmount = scanner.nextInt();
                result = num >>> shiftAmount;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("Result: " + result);l

        scanner.close();
    }
}