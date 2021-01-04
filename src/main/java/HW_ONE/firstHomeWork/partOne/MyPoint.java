package HW_ONE.firstHomeWork.partOne;

import java.util.Objects;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return  new int[]{getX(), getY()};
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }


    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(this.x-another.getX(),2)+Math.pow(this.y-another.getY(),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int hashCode=super.hashCode();
        int result=31*hashCode+x;
        result=31*result+y;
        return result;
    }
}
