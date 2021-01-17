package HW_JAVA.secondHomeWork.chapter1;

// НЕ ЗАВЕРШИЛА!!!!!
public class Ex7 {

    private Integer int1=453;
    private Integer int2=2147483646;

    public void compare(Integer int1,Integer int2){
        System.out.println(Integer.compareUnsigned(Integer.parseInt(int2.toString()),int1));
    }

    public void sum(Integer int1,Integer int2){
         String newInt1=Integer.toUnsignedString(int1);
         String newInt2=Integer.toUnsignedString(int2);
         System.out.println((Integer.toUnsignedLong(int1)+Integer.toUnsignedLong(int2)));
    }

    public void divide(Integer int1,Integer int2){
        Integer.divideUnsigned(int1,int2);
    }

    public void remainder(Integer int1,Integer int2){
        Integer.remainderUnsigned(int1,int2);
    }

    public static void main(String[] args) {
        Ex7 integersBetweenSeven=new Ex7();
        //integersBetweenSeven.compare();
        Integer int1=124753;
        Integer int2=-343532;
        integersBetweenSeven.sum(int1,int2);
    }

}
