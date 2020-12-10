package HW_ONE.triangle;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
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
        double inaccuracy = 0.000001;
        boolean twoSidesOne = (getDistance(v1, v2) - getDistance(v1, v3)) < inaccuracy;
        boolean twoSidesTwo = (getDistance(v1, v3) - getDistance(v2, v3)) < inaccuracy;
        boolean twoSidesThree = (getDistance(v1, v2) - getDistance(v2, v3)) < inaccuracy;

        if(twoSidesOne & twoSidesTwo & twoSidesThree){
            return TrianglesType.Equilateral;
        }else if((twoSidesOne & twoSidesTwo )|| (twoSidesOne & twoSidesThree) || (twoSidesTwo & twoSidesThree)){
            return TrianglesType.Isosceles;
        }else {
            return TrianglesType.Scalene;
        }
    }

    private double getDistance(MyPoint pointOne, MyPoint pointTwo) {
        return Math.sqrt(Math.pow(pointOne.getX() - pointTwo.getX(), 2) + Math.pow(pointOne.getY() - pointTwo.getY(), 2));
    }
}
