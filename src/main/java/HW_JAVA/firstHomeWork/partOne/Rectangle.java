package HW_JAVA.firstHomeWork.partOne;


public class Rectangle {
    private float length=1.0f;
    private float wight=1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float wight) {
        try {
            checkSides(length, wight);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        this.length = length;
        this.wight = wight;
    }

    public float getLength() {
        return length;
    }

    public float getWight() {
        return wight;
    }

    public void setLength(float length) throws Exception {
        if(length<=0)
            throw new Exception();//"Pay attention: length MUST BE > 0 !"
        this.length = length;
    }

    private void checkSides(float length, float wight) throws Exception {
        if(length<=0 | wight<=0){
            throw new Exception("Pay attention: length and wight MUST BE > 0 !");//"Pay attention: length and wight MUST BE > 0 !"
        }
    }
    public void setWight(float wight) throws Exception {
        if(wight<=0)
            throw new Exception();//"Pay attention: wight MUST BE > 0 !"
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.length, length) == 0 &&
                Float.compare(rectangle.wight, wight) == 0;
    }

    @Override
    public int hashCode() {
        int hashCode=super.hashCode();
        int result=31*hashCode+ (int) length;
        result=31*result+ (int) wight;
        return result;
    }
}
