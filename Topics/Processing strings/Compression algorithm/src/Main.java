import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder encodedString = new StringBuilder();

        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++){
            if (input.charAt(i) == currentChar){
                count++;
            } else {
              encodedString.append(currentChar).append(count);
              currentChar = input.charAt(i);
              count = 1;
            }
        }
        encodedString.append(currentChar).append(count);            // Append the last character and its count
        System.out.println(encodedString);
    }
}