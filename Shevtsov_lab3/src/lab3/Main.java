package lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Butter> butters = new ArrayList<>();

        try {
            for (int i = 0; i < 10; i++) {
                Butter butter = ButterReader.readButterFromConsole();
                butters.add(butter);
            }
        } catch (IOException e) {
            System.out.println("Error occurred during user input: " + e.getMessage());
        }

        String fileName = "butters.ser";
        ButterSerializationHelper.serializeButters(butters, fileName);

        List<Butter> deserializedButters = ButterSerializationHelper.deserializeButters(fileName);

        // Подсчет общей стоимости масла
        int totalCost = 0;
        int countVegetableButters = 0;

        for (Butter butter : deserializedButters) {
            totalCost += butter.getPrice();
            if (butter.hasVegetableAdditives()) {
                countVegetableButters++;
            }
        }

        System.out.println("Total cost of butter: " + totalCost);
        System.out.println("Number of butters with vegetable additives: " + countVegetableButters);
    }
}