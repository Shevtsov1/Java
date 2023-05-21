package lab2.services;

import lab2.models.Tax;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxSorter {
    public static void sortTaxesByAmount(List<Tax> taxes) {
        // Using a custom comparator to compare taxes by amount
        Comparator<Tax> taxComparator = Comparator.comparingDouble(Tax::getAmount);

        // Sorting the taxes in ascending order based on the amount
        Collections.sort(taxes, taxComparator);
    }
}