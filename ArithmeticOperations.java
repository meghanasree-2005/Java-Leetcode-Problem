import java.util.Scanner;

public class ArithmeticOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Addition
        System.out.print("Enter the first number for addition: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number for addition: ");
        double num2 = sc.nextDouble();

        double sumResult = num1 + num2;
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sumResult);

        // Division
        System.out.print("Enter the dividend for division: ");
        double num3 = sc.nextDouble();

        System.out.print("Enter the divisor for division: ");
        double num4 = sc.nextDouble();

        if (num4 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double divResult = num3 / num4;
            System.out.println("Division: " + num3 + " / " + num4 + " = " + divResult);
        }

        sc.close();
    }
}
