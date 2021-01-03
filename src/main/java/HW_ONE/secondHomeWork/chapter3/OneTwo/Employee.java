package HW_ONE.secondHomeWork.chapter3.OneTwo;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Measurable {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
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

    Measurable largest(Measurable[] objects){
        ArrayList<Double> array =new ArrayList<>();
        for (int i = 0; i < objects.length; i++) {
            if( objects[i] instanceof Employee){
                Employee employee= (Employee) objects[i];
                array.add(employee.getMeasure());
            }
        }
        return objects[Collections.binarySearch(array,Collections.max(array))];
    }

}
