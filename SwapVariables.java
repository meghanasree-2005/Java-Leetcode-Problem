import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two variables
        System.out.print("Enter the value of the first variable (a): ");
        String a = scanner.nextLine();

        System.out.print("Enter the value of the second variable (b): ");
        String b = scanner.nextLine();

        // Display the original values
        System.out.println("Original values: a = " + a + ", b = " + b);

        // Swap using a temporary variable
        String temp = a;
        a = b;
        b = temp;

        // Display the swapped values
        System.out.println("Swapped values: a = " + a + ", b = " + b);

        scanner.close();
    }
}