package lab1;

public class Main {
    public static void main(String[] args) {
        Butter[] butters = new Butter[10];
        butters[0] = new Butter("Butter 1", true, 10);
        butters[1] = new Butter("Butter 2", false, 15);
        butters[2] = new Butter("Butter 3", true, 8);
        butters[3] = new Butter("Butter 4", true, 12);
        butters[4] = new Butter("Butter 5", false, 3);
        butters[5] = new Butter("Butter 6", true, 7);
        butters[6] = new Butter("Butter 7", false, 12);
        butters[7] = new Butter("Butter 8", false, 9);
        butters[8] = new Butter("Butter 9", true, 13);
        butters[9] = new Butter("Butter 10", true, 6);
        
        // Подсчет общей стоимости масла
        int totalCost = 0;
        for (Butter butter : butters) {
            totalCost += butter.getPrice();
        }
        System.out.println("Total cost of butter: " + totalCost);

        // Подсчет количества видов масла с растительными добавками
        int countWithAdditives = 0;
        for (Butter butter : butters) {
            if (butter.hasVegetableAdditives()) {
                countWithAdditives++;
            }
        }
        System.out.println("Number of butters with vegetable additives: " + countWithAdditives);
    }
}