import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();

        int indexOfFistOccurrence = str.indexOf("the");

        System.out.println(indexOfFistOccurrence);
    }
}