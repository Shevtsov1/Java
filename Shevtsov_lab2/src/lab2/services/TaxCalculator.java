package lab2.services;

public class TaxCalculator {
    public static double calculateIncomeTax(double income) {
    	double taxRate = 0.20; // Пример: ставка налога 20%
        double tax = income * taxRate; // Расчет налога на доходы
        return tax;
    }

    public static double calculatePropertyTax(double propertySales) {
        double taxRate = 0.10; // Пример: ставка налога 10%
        double tax = propertySales * taxRate; // Расчет налога на продажу имущества
        return tax;
    }
}