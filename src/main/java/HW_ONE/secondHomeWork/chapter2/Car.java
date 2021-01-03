package HW_ONE.secondHomeWork.chapter2;

public class Car {
    private double x; //miles
    private double gallons; //1 gallon=4.55l
    private double volume;
    private double distance;

    //2 gallons = 62 miles -> 1 gal=32 miles OR 1 mile=1/32 gal

    public Car(double miles, double gallons) {
        this.x = miles;
        this.gallons = gallons;
        this.volume=this.gallons*4.55; //litr
        this.distance=miles;
    }

    public void  addGallons(int plusGallons){
        this.gallons+=plusGallons;
        this.volume+=plusGallons*4.55;
    }
    //  1m=1/32 gall
    //  0.5m=1/32 * 0.5 gall
    //  1m= (4.55/32) litr
    public void addMiles(double plusMile){
        double temp=this.volume - (4.55/32)*plusMile;
        if(temp>=0) {
            this.volume -= 0.14 * plusMile;
            this.distance += plusMile;
        }else
            System.out.println("Volume is empty. Need gallons. Car is stoped");

    }
    public double getMiles(){
        return distance-this.x;
    }

    public double getGallons(){
        return volume*4.55;
    }


    public static void main(String[] args) {

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


    }
}
