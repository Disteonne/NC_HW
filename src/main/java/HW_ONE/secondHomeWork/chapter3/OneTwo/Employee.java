package HW_ONE.secondHomeWork.chapter3.OneTwo;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Measurable {
    private double salary;
    private String name;

    public Employee(double salary,String name) {
        this.salary = salary;
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    double average(Measurable[] objects){
        double sum=0.0;
        for (int i = 0; i < objects.length; i++) {
            sum+= objects[i].getMeasure();
        }
        return objects.length==0 ? 0.0:sum/objects.length;
    }

    String largest(Measurable[] objects){
        ArrayList<Double> array =new ArrayList<>();
        for (int i = 0; i < objects.length; i++) {
            if( objects[i] instanceof Employee){
                Employee employee= (Employee) objects[i];
                array.add(employee.getMeasure());
            }
        }
        return objects[Collections.binarySearch(array,Collections.max(array))].getName();
    }

}
