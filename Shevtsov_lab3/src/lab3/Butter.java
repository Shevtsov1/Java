package lab3;

import java.io.Serializable;

class Butter implements Serializable {
	// Уникальный идентификатор версии для сериализации
	private static final long serialVersionUID = 1L;
	private String name;
    private boolean hasVegetableAdditives;
    private int price;

    public Butter(String name, boolean hasVegetableAdditives, int price) {
        this.name = name;
        this.hasVegetableAdditives = hasVegetableAdditives;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean hasVegetableAdditives() {
        return hasVegetableAdditives;
    }

    public int getPrice() {
        return price;
    }
}
