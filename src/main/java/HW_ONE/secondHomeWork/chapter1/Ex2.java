package HW_ONE.secondHomeWork.chapter1;

public class Ex2 {

    public int getDegree(int degree){
        //System.out.println(degree%360);
        return degree%360;
    }

    public int getDegreeFloorMood(int degree){
       // System.out.println(Math.floorMod(degree,360));
        return Math.floorMod(degree,360);
    }

    public static void main(String[] args) {
        Ex2 ex2 =new Ex2();
        ex2.getDegree(-630);//-270
        ex2.getDegreeFloorMood(-630);//90
    }
}
