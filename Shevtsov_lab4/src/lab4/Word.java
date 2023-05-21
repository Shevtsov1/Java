package lab4;

import java.util.List;
import java.util.ArrayList;

public class Word {
    private List<Symbol> symbols;

    public Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (Symbol symbol : symbols) {
            sb.append(symbol.getValue());
        }
        return sb.toString();
    }

    public void setValue(String transformed) {
        List<Symbol> transformedSymbols = new ArrayList<>();
        for (int i = 0; i < transformed.length(); i++) {
            char c = transformed.charAt(i);
            transformedSymbols.add(new Symbol(c));
        }
        this.symbols = transformedSymbols;
    }
}
