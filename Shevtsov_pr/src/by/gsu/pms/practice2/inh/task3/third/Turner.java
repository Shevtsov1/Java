package by.gsu.pms.practice2.inh.task3.third;

public class Turner extends Worker {
    @Override
    public double getPay() {
        return 200.5;
    }
    
    @Override
    public String getKind() {
        return "Turner";
    }
}