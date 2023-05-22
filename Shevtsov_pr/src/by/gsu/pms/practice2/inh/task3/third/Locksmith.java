package by.gsu.pms.practice2.inh.task3.third;

public class Locksmith extends Worker {
    @Override
    public double getPay() {
        return 201.0;
    }
    
    @Override
    public String getKind() {
        return "Locksmith";
    }
}