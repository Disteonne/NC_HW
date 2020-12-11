package HW_ONE.partOne;

public class Rectangle {
    private float length=1.0f;
    private float wight=1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float wight) {
        this.length = length;
        this.wight = wight;
    }

    public float getLength() {
        return length;
    }

    public float getWight() {
        return wight;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }
    public double getArea(){
        return wight*length;
    }
    public double getPerimeter(){
        return 2*(wight+length);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", wight=" + wight +
                ']';
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(wight,2)+Math.pow(length,2));
    }
}
