package lab5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание объектов масла
            Butter butter1 = ButterReader.createButterFromUserInput();
            Butter butter2 = ButterReader.createButterFromUserInput();

            // Сериализация объектов в файлы
            ObjectSerializer.serializeObject(butter1, "butter1.txt");
            ObjectSerializer.serializeObject(butter2, "butter2.txt");

            // Десериализация объектов из файлов
            Butter deserializedButter1 = (Butter) ObjectDeserializer.deserializeObject("butter1.txt");
            Butter deserializedButter2 = (Butter) ObjectDeserializer.deserializeObject("butter2.txt");

            // Подсчет общей стоимости масла
            double totalCost = deserializedButter1.getPrice() + deserializedButter2.getPrice();
            System.out.println("Общая стоимость масла: " + totalCost);

            // Подсчет количества видов масла с растительными добавками
            int count = 0;
            if (butter1.hasVegetableAdditives()) {
                count++;
            }
            if (butter2.hasVegetableAdditives()) {
                count++;
            }
            System.out.println("Количество видов масла с растительными добавками: " + count);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке класса: " + e.getMessage());
        }
    }
}
