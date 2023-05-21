package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ButterReader {
    public static Butter createButterFromUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите название масла: ");
        String name = reader.readLine();

        System.out.print("Наличие растительных добавок (true/false): ");
        boolean hasVegetableAdditives = Boolean.parseBoolean(reader.readLine());

        System.out.print("Введите цену масла: ");
        double price = Double.parseDouble(reader.readLine());

        return new Butter(name, hasVegetableAdditives, price);
    }
}
