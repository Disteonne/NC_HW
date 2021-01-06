package HW_ONE.secondHomeWork.chapter2;

import jdk.nashorn.internal.runtime.ECMAException;

public class Car {
    private double x; //pixels
    private double gallons; //1 gallon=4.55l
    private double miles;
    private double milesGallons;


    public Car(int milesGallons){
        this.milesGallons=milesGallons;
    }

    public void  addGallons(int plusGallons) throws Exception {
        if (plusGallons<0){
            throw new Exception("Gallons must be > 0");
        }
        this.gallons+=plusGallons;
    }

    public void addMiles(double plusMile) throws Exception {
        while (milesGallons<=gallons){
            if(plusMile<0)
                throw new Exception("Miles must be > 0");
            else if(plusMile==0)
                break;
            else {
                x+=10; // pixel
                miles++;
                plusMile--;
                gallons-=milesGallons;
            }
        }
    }
    public double getMiles(){
        return miles;
    }

    public double getGallons(){
        return gallons;
    }


    public static void main(String[] args) {

        /*
        Car car=new Car(0,1);
        car.addMiles(32);
        System.out.println(car.getMiles());
        car.addMiles(1);
        System.out.println(car.getMiles());
        car.addGallons(2);
        car.addMiles(17);
        System.out.println(car.getMiles());
        car.addMiles(12);
        System.out.println(car.getMiles());

        double tmp=1;
        while (tmp<=12){
            car.addMiles(4);
            tmp+=1;
            System.out.println(car.getMiles());
        }
         */

    }
}
