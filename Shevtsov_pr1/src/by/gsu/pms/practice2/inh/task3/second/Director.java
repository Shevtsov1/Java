package by.gsu.pms.practice2.inh.task3.second;

import java.io.PrintStream;

public class Director implements Descriptor, Employee {
    @Override
    public void printInfo(PrintStream stream) {
        stream.println("Director(" + getPay() + ")");
    }
    
    @Override
    public double getPay() {
        return 300.0;
    }
}