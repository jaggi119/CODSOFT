import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1; // number between 1-100
        int attempts = 5;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts.");

        for(int i = 1; i <= attempts; i++) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }
            else if(guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Too low! Try again.");
            }

            if(i == attempts) {
                System.out.println("Game Over! The correct number was: " + randomNumber);
            }
        }

        scanner.close();
    }
}
