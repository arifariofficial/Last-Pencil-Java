import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = removeMiddleCharacters(input);
        System.out.println(output);
    }

    private static String removeMiddleCharacters(String s) {
        int length = s.length();
        if (length % 2 == 0) { // If the length is even
            return s.substring(0, length / 2 - 1) + s.substring(length / 2 + 1);
        } else { // If the length is odd
            return s.substring(0, length / 2) + s.substring(length / 2 + 1);
        }
    }
}