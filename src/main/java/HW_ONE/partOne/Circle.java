package HW_ONE.partOne;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getLengthCircle(){
        return 2*Math.PI*radius;
    }
    public  double getArcLength(double angle){
        return Math.PI*radius*angle/180.0;
    }
    public double gerAreaSector(double angle){
        return Math.PI*Math.pow(radius,2)*angle/360.0;
    }
}
