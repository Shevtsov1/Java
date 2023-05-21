package lab5;

import java.io.*;

public class Butter implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private boolean hasVegetableAdditives;
    private double price;

    public Butter(String name, boolean hasVegetableAdditives, double price) {
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

    public double getPrice() {
        return price;
    }
}
