import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        
        String longestWord = "";
        for (int i = 0; i < words.length; i++){
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        System.out.println(longestWord);
    }
}