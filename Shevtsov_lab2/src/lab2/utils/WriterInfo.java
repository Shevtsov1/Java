package lab2.utils;

import lab2.models.*;

public class WriterInfo {
	public static void printTaxpayerInfo(Taxpayer taxpayer) {
	    System.out.println("Taxpayer Information:");
	    System.out.println("Name: " + taxpayer.getName());
	    System.out.println("Main Income: " + taxpayer.getMainIncome());
	    System.out.println("Additional Income: " + taxpayer.getAdditionalIncome());
	    System.out.println("Royalties: " + taxpayer.getRoyalties());
	    System.out.println("Property Sales: " + taxpayer.getPropertySales());
	    // Другие поля налогоплательщика

	    System.out.println("Total Tax: " + taxpayer.calculateTotalTax());
	    // Другие методы для вывода информации о налогоплательщике

	    System.out.println("------------------------------");
	}

	public static void printTaxInfo(Tax tax) {
	    System.out.println("Tax Information:");
	    System.out.println("Amount: " + tax.getAmount());
	    // Другие поля налоговой выплаты

	    System.out.println("------------------------------");
	}
}