package HW_ONE.secondHomeWork.chapter1;

public class DegreeTwo {

    public int getDegree(int degree){
        //System.out.println(degree%360);
        return degree%360;
    }

    public int getDegreeFloorMood(int degree){
       // System.out.println(Math.floorMod(degree,360));
        return Math.floorMod(degree,360);
    }

    public static void main(String[] args) {
        DegreeTwo degreeTwo=new DegreeTwo();
        degreeTwo.getDegree(-630);//-270
        degreeTwo.getDegreeFloorMood(-630);//90
    }
}
