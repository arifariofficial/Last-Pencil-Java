import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] userInput = input.split(" ");

        String s = userInput[0];
        int n = Integer.parseInt(userInput[1]);

        String output = s;

        if (n < s.length()) {
            output = s.substring(n) + s.substring(0, n);
        }

        System.out.println(output);
    }
}