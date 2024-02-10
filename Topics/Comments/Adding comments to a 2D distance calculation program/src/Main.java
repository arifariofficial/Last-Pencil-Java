import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Extract the co-ordinates of the first point: x1 and y1

        String[] input1 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input1[0]);
        int y1 = Integer.parseInt(input1[1]);

        // Extract the co-ordinates of the second point: x2 and y2

        String[] input2 = scanner.nextLine().split(" ");
        int x2 = Integer.parseInt(input2[0]);
        int y2 = Integer.parseInt(input2[1]);

        // Implement the formula to calculate the distance between two points on a 2D plane

        // Print the calculated distance
    }
}