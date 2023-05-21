package lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TextProcessor {
    private StringBuilder text;

    public TextProcessor(String filePath) {
        text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processText() {
        replaceTabsAndSpaces();
        String[] words = text.toString().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String modifiedWord = removeDuplicateLetters(word);
            result.append(modifiedWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    private void replaceTabsAndSpaces() {
        text = new StringBuilder(text.toString().replaceAll("\\s+", " "));
    }

    private String removeDuplicateLetters(String word) {
        char firstLetter = word.charAt(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar != firstLetter) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}