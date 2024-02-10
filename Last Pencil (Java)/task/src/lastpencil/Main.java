package lastpencil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("How many pencils would you like to use:");
        int numberOfPencils = 0;
        while (true) {
            try {
                numberOfPencils = Integer.parseInt(scanner.nextLine());
                if (numberOfPencils > 0) {
                    break;
                } else {
                    System.out.println("The number of pencils should be positive");
                }
            } catch (NumberFormatException e) {
                System.out.println("The number of pencils should be numeric");
            }
        }

        System.out.println("Who will be the first (John, Jack):");
        String currentPlayer = "";
        String otherPlayer = "";

        while (true) {                                                              // Reading player name
            currentPlayer = scanner.nextLine().trim();                              // Trim any leading or trailing whitespace
            if (currentPlayer.equals("John") || currentPlayer.equals("Jack")) {
                break;
            } else {
                System.out.println("Choose between 'John' and 'Jack'");
            }
        }
        otherPlayer = currentPlayer.equals("John") ? "Jack" : "John";

        while (true) {
            if (numberOfPencils > 0) {
                System.out.println("|".repeat(numberOfPencils));
            }
            System.out.println(currentPlayer + "'s turn!");

            int pencilsTaken = 0;

            if ("Jack".equals(currentPlayer)) {                                 // Bots Turn
                pencilsTaken = botStrategy(numberOfPencils, random);

                if (pencilsTaken > numberOfPencils) {
                    pencilsTaken = numberOfPencils;
                }

                System.out.println(pencilsTaken);                               // Print Jack's move
                numberOfPencils -= pencilsTaken;

                if (numberOfPencils == 0) {
                    // If the game ends after Jack's move, print the result immediately
                    System.out.println(otherPlayer + " won!");
                    break;
                }
            } else {
                while (true) {                                                   // Players turn
                    if (scanner.hasNextInt()) {
                        pencilsTaken = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        if (pencilsTaken >= 1 && pencilsTaken <= 3) {
                            if (pencilsTaken <= numberOfPencils) {
                                numberOfPencils -= pencilsTaken;
                                break; // Valid input, exit the loop
                            } else {
                                System.out.println("Too many pencils were taken");
                            }
                        } else {
                            // Adjusting the error message to match the specified format exactly
                            System.out.println("Possible values: '1', '2', '3'");
                        }
                    } else {
                        System.out.println("Possible values: '1', '2', '3'");
                        scanner.nextLine();
                    }
                }
            }

            if (numberOfPencils > 0) {                                // Swap players only if there are pencils left
                String temp = currentPlayer;
                currentPlayer = otherPlayer;
                otherPlayer = temp;
            } else {
                System.out.println(otherPlayer + " won!");           // If no pencils left, announce the winner
                break;
            }
        }
    }

    public static int botStrategy(int numberOfPencils, Random random) {
        if (numberOfPencils % 4 == 1) {                                         // Losing position
            return random.nextInt(3) + 1;                                // Randomly takes 1, 2, or 3 pencils
        } else {
            int pencilsToTake = (numberOfPencils % 4) - 1;
            if (pencilsToTake <= 0) { // If pencilsToTake is 0 or negative, it means numberOfPencils is a multiple of 4
                pencilsToTake = 3; // Take 3 pencils to leave the opponent with (numberOfPencils - 3), a multiple of 4 + 1
            }
            return pencilsToTake;
        }
    }
}
