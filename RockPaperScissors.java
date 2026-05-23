import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");

        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = sc.nextLine();

        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Draw!");
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}