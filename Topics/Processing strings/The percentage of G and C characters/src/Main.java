import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().toUpperCase();

        int count = 0;                                                  // Count G and C
        for (int i = 0; i < sequence.length(); i++) {
            char value = sequence.charAt(i);
            if (value == 'G' || value == 'C') {
                count++;
            }
        }
        double percentage = (double) count / sequence.length() * 100;
        System.out.println(percentage);
    }
}