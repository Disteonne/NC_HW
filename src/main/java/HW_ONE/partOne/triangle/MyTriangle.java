package HW_ONE.partOne.triangle;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=(" + v1.getX() + "," + v1.getY() + "),v2=(" + v2.getX() + "," + v2.getY() + ")," +
                "v3=(" + v3.getX() + "," + v3.getY() + ")";
    }

    public double getPerimeter() {
        return getDistance(v1, v2) + getDistance(v1, v3) + getDistance(v2, v3);
    }


    public TrianglesType getTypes() {
        byte twoSidesOne = (byte) Double.compare(getDistance(v1, v2), getDistance(v1, v3));
        byte twoSidesTwo = (byte) Double.compare(getDistance(v1, v3), getDistance(v2, v3));
        byte twoSidesThree = (byte) Double.compare(getDistance(v1, v2), getDistance(v2, v3));

        if (twoSidesOne==0 & twoSidesTwo==0 & twoSidesThree==0) {
            return TrianglesType.Equilateral;
            //(twoSidesOne==0 & twoSidesTwo==0) | (twoSidesOne==0 & twoSidesThree==0) | (twoSidesTwo==0 & twoSidesThree==0)
        } else if (twoSidesOne ==0 | twoSidesTwo==0 | twoSidesThree==0) {
            return TrianglesType.Isosceles;
        } else {
            return TrianglesType.Scalene;
        }
    }

    private double getDistance(MyPoint pointOne, MyPoint pointTwo) {
        return Math.sqrt(Math.pow(pointOne.getX() - pointTwo.getX(), 2) + Math.pow(pointOne.getY() - pointTwo.getY(), 2));
    }
}
