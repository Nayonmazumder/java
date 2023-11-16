import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program34 {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Replace with your file path
        String wordToCount = "your_word"; // Replace with the word to count occurrences

        int count = countWordOccurrences(filePath, wordToCount);
        System.out.println("The word '" + wordToCount + "' appears " + count + " times in the text.");
    }

    public static int countWordOccurrences(String filePath, String wordToCount) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToCount)) { // Case-insensitive comparison
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return count;
    }
}
