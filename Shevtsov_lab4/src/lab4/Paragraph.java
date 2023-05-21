package lab4;

import java.util.List;

public class Paragraph {
    private List<Sentence> sentences;

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.getText());
        }
        sb.append("\n");
        return sb.toString();
    }
}