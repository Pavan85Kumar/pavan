import java.util.Scanner;

public class WordCounter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        // Use regex to split the string into words
        String[] words = input.trim().split("\\s+");
        
        // Count words
        int wordCount = words.length;
        
        // Handle empty input case
        if (input.trim().isEmpty()) {
            wordCount = 0;
        }
        
        System.out.println("Word count: " + wordCount);
        
        scanner.close();
    }
}
