package HW_ONE.secondHomeWork.chapter4.exSix;

public class Main {
    public static void main(String[] args) {
        DiscountedItem d1=new DiscountedItem("apple",100,0);
        DiscountedItem d2=new DiscountedItem("apple",100,0);
        DiscountedItem d3=new DiscountedItem("apple",100,0);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d2.equals(d3)); //how can do this?
    }
}
