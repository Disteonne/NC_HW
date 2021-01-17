package HW_JAVA.secondHomeWork.chapter2;

public class Car {
    private double x; //pixels
    private double gallons;
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

}
