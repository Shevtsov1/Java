package lab3;

import java.io.*;

class ButterReader {
    public static Butter readButterFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter butter details:");
        System.out.print("Name: ");
        String name = reader.readLine();
        System.out.print("Has vegetable additives? (true/false): ");
        boolean hasVegetableAdditives = Boolean.parseBoolean(reader.readLine());
        System.out.print("Price: ");
        int price = Integer.parseInt(reader.readLine());
        return new Butter(name, hasVegetableAdditives, price);
    }
}