package lab2.models;

import lab2.services.*;

public class Taxpayer {
    private String name;
    private double mainIncome;
    private double additionalIncome;
    private double royalties;
    private double propertySales;
    
    double mainIncomeTax = 0;
    double additionalIncomeTax = 0;
    double royaltiesTax = 0;
    double propertySalesTax = 0;

    public Taxpayer(String name, double mainIncome, double additionalIncome, double royalties, double propertySales) {
        this.name = name;
        this.mainIncome = mainIncome;
        this.additionalIncome = additionalIncome;
        this.royalties = royalties;
        this.propertySales = propertySales;
    }

    public double calculateTotalTax() {
        mainIncomeTax = TaxCalculator.calculateIncomeTax(mainIncome);
        additionalIncomeTax = TaxCalculator.calculateIncomeTax(additionalIncome);
        royaltiesTax = TaxCalculator.calculateIncomeTax(royalties);
        propertySalesTax = TaxCalculator.calculatePropertyTax(propertySales);
        
        double totalTax = mainIncomeTax + additionalIncomeTax + royaltiesTax + propertySalesTax;
        return totalTax;
    }
    
	public String getName() {
		return name;
	}

	public double getRoyalties() {
		return royalties;
	}

	public double getMainIncome() {
		return mainIncome;
	}

	public double getPropertySales() {
		return propertySales;
	}

	public double getAdditionalIncome() {
		return additionalIncome;
	}
}