package lab1;

public class Butter {
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