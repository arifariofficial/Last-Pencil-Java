import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading input data
        String text = scanner.nextLine();
        String substring = scanner.nextLine();

        int count = 0;
        int fromIndex = 0;

        while (true) {
            int foundAt = text.indexOf(substring, fromIndex);
            if (foundAt == -1) {                                 // if not found indexOf() returns -1
                break;
            }
            count++;                                            // Increment when found
            fromIndex = foundAt + substring.length();           // Ensure non-overlapping
        }
        System.out.println(count);
    }
}