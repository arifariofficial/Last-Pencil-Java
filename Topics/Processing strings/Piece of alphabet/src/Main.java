import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isAlphabetPiece = isPieceOfAlphabet(input);          // Calling method
        System.out.println(isAlphabetPiece);
    }

    private static boolean isPieceOfAlphabet(String string) {
        if (string.isEmpty()) {                                      // Assume an emtpy string as an alphabet substring
            return true;
        }

        for (int i = 0; i < string.length() - 1; i++) {              // length() - 1, so index not out of bounds in next line
            if (string.charAt(i) + 1 != string.charAt(i + 1)) {      // Check current character is followed by its consecutive character
                return false;
            }
        }
        return true;
    }
}
