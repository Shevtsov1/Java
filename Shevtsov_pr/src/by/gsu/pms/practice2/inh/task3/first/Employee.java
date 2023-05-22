package by.gsu.pms.practice2.inh.task3.first;

public class Employee {
    public Employee(double pay) {
        if (pay < 0.0) {
            throw new IllegalArgumentException("Pay may not be less than 0");
        }
        
        this.pay = pay;
    }
    
    private final double pay;
    
    public double getPay() {
        return pay;
    }
}