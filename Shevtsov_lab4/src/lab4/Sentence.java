package lab4;

import java.util.List;

public class Sentence {
    private List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            sb.append(word.getValue()).append(" ");
        }
        sb.append(". ");
        return sb.toString();
    }
    
    public void transformWords() {
        for (Word word : words) {
            String value = word.getValue();
            char firstLetter = value.charAt(0);
            char lastLetter = value.charAt(value.length() - 1);

            // Удаление следующих вхождений первой буквы
            String transformed = value.replaceAll(Character.toString(firstLetter) + "+", Character.toString(firstLetter));
            // Удаление предыдущих вхождений последней буквы
            transformed = transformed.replaceAll(Character.toString(lastLetter) + "+$", Character.toString(lastLetter));

            word.setValue(transformed);
        }
    }
}