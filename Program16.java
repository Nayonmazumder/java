import java.util.HashMap;
import java.util.Map;

public class Program16 {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed posuere mi. Mauris libero dui, laoreet ut "
                +
                "placerat vel, euismod vitae felis. Mauris commodo, nisl nec porttitor varius, turpis justo faucibus sem, et "
                +
                "fringilla mauris lectus in risus. Sed pharetra vitae turpis quis facilisis. Nulla facilisi. Curabitur vitae "
                +
                "tempor purus, id vulputate nunc. Donec mollis diam a mauris feugiat fermentum. Morbi efficitur gravida "
                +
                "dapibus. Nulla eget felis nec mi sollicitudin pulvinar.";

        Map<String, Integer> wordFrequencyMap = getWordFrequency(text);

        // Print the word frequency count
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            // Remove punctuation and convert to lowercase for accurate comparison
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Ignore empty words
            if (!word.isEmpty()) {
                // Update word frequency count
                if (wordFrequencyMap.containsKey(word)) {
                    wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
                } else {
                    wordFrequencyMap.put(word, 1);
                }
            }
        }

        return wordFrequencyMap;
    }
}