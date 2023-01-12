package GamesAndPrograms;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1 ;

        // System.out.println("Random number is: " + randomNumber); random sayıyı görebiliriz

        int tryCount = 0;   // sayaç

        while (true){

        System.out.print("Enter your guess (1-100): ");

        int playerGuess = scanner.nextInt();

        tryCount++;

        if (playerGuess == randomNumber){
            System.out.println("Correct! You win!");
            System.out.println("It took you " + tryCount + " tries");
            break;

        } else if (randomNumber > playerGuess) {
            System.out.println("Nope! The number is higher. Guess again.");
        }
        else {
            System.out.println("Nope! The number is lower. Guess again. ");
        }
    }}
}
