import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversion formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println(celsius + " degrees Celsius is equal to " 
                           + fahrenheit + " degrees Fahrenheit");

        scanner.close();
    }
}
