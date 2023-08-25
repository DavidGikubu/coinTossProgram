import java.util.Random;

public class CoinTossProgram {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number: 0 or 1
        int randomNumber = random.nextInt(2);

        // Convert the random number to "Heads" or "Tails"
        String result = (randomNumber == 0) ? "Heads" : "Tails";

        // Capitalize the first letter
        result = result.substring(0, 1).toUpperCase() + result.substring(1);

        // Print the result
        System.out.println(result);
    }
}

