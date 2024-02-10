import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.nextLine();

        int sumOfFirstHalf = 0, sumOfLastHalf = 0;
        for (int i = 0; i < 3; i++){
            sumOfFirstHalf += Character.getNumericValue(ticketNumber.charAt(i));
            sumOfLastHalf += Character.getNumericValue(ticketNumber.charAt(i+3));
        }

        if (sumOfFirstHalf == sumOfLastHalf){
            System.out.println("Lucky");
        }else {
            System.out.println("Regular");
        }
    }
}