import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100) + 1; // generates 1 to 100

        System.out.println("Random number: " + number);
    }
}