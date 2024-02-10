import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        StringBuilder reverseInput = new StringBuilder(input).reverse();

        if (input.contentEquals(reverseInput)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}