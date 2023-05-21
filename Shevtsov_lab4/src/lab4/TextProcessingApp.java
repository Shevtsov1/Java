package lab4;

public class TextProcessingApp {
    public static void main(String[] args) {
        String filePath = "textbook.txt";
        TextProcessor textProcessor = new TextProcessor(filePath);
        textProcessor.processText();
    }
}
