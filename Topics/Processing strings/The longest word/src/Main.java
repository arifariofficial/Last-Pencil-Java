import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String longestWord = "";

        for (String word: words){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}