import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess > secret) {
                System.out.println("Too High!");
            } else if (guess < secret) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct!");
            }
        } while (guess != secret);

        sc.close();
    }
}