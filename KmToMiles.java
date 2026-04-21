import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Conversion factor
        double conversionFactor = 0.621371;

        // Convert to miles
        double miles = kilometers * conversionFactor;

        // Display result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");

        scanner.close();
    }
}