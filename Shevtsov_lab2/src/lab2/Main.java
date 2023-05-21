package lab2;

import lab2.models.*;
import lab2.utils.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) {
		
		String filePath = "taxpayers.txt";
		
		 List<Taxpayer> taxpayers = new ArrayList<>();

		    // Чтение информации о налогоплательщиках из файла
		    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
		        String line;
		        while ((line = reader.readLine()) != null) {
		            String[] data = line.split(";");

		            // Предполагается, что данные в файле имеют следующий формат:
		            // Имя;Основной доход;Дополнительный доход;Авторские вознаграждения;Продажа имущества
		            String name = data[0];
		            double mainIncome = Double.parseDouble(data[1]);
		            double additionalIncome = Double.parseDouble(data[2]);
		            double royalties = Double.parseDouble(data[3]);
		            double propertySales = Double.parseDouble(data[4]);

		            Taxpayer taxpayer = new Taxpayer(name, mainIncome, additionalIncome, royalties, propertySales);
		            taxpayers.add(taxpayer);
		        }

		        System.out.println("Taxpayers information loaded successfully.");
		    } catch (IOException e) {
		        System.out.println("Error occurred while reading taxpayers information: " + e.getMessage());
		    }

        // Вычисление общей суммы налоговых выплат
        double totalTax = 0;
        for (Taxpayer tp : taxpayers) {
            totalTax += tp.calculateTotalTax();
        }

        // Вывод информации о налогоплательщиках и налоговых выплатах
        for (Taxpayer tp : taxpayers) {
            WriterInfo.printTaxpayerInfo(tp);
        }

        System.out.println("Total tax: " + totalTax);
	}
}
