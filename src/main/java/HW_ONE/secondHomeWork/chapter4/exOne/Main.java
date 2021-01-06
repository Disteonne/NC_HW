package HW_ONE.secondHomeWork.chapter4.exOne;

public class Main {
    public static void main(String[] args) {
        //Point point=new Point(6,9);
        LabeledPoint labeledPoint=new LabeledPoint(6,9,"label");
        System.out.println(labeledPoint.x); //if private then error
        System.out.println(labeledPoint.y);

    }
}
