import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        // Reading K, N, and M from input
        long K = scanner.nextLong();
        int N = scanner.nextInt();
        double M = scanner.nextDouble();

        // Seed variable starting from K
        long seed = K;

        while (true) {
            Random randomGenerator = new Random(seed);
            boolean allLessThanM = true;

            // Generating N Gaussian numbers with the current seed
            for (int i = 0; i < N; i++) {
                if (randomGenerator.nextGaussian() > M) {
                    allLessThanM = false;
                    break; // Break if any number is greater than M
                }
            }

            // If all N numbers are <= M, break the loop and print the seed
            if (allLessThanM) {
                System.out.println(seed);
                break;
            }

            // Increment the seed for the next iteration
            seed++;
        }

        scanner.close();
    }
}