package HW_ONE.firstHomeWork.partOne;

import java.util.Objects;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius) {
        useCheck();
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        useCheck();
        this.radius = radius;
        this.color = color;
    }

    private void  checkRad(double radius) throws Exception {
        if(radius<=0)
            throw new Exception("Pay attention: radius MUST BE > 0 !");
    }
    private void useCheck(){
        try {
            checkRad(radius);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        useCheck();
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color=" + color +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        int hashCode=super.hashCode();
        int result=31*hashCode+ (int) radius;
        result=31*result+color.hashCode();
        return result;
    }
}
