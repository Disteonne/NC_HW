package HW_JAVA.secondHomeWork.chapter1;

public class Ex9 {

    public static boolean equalsString(String stringFirst,String stringSecond){
        if(getCount(stringFirst,stringSecond)==Math.max(stringFirst.length(),stringSecond.length()))
            return true;
        else
            return false;
    }

    public static boolean equalsStringCaseIgnore(String stringFirst,String stringSecond){
        if(getCount(stringFirst.toLowerCase(),stringSecond.toLowerCase())==Math.max(stringFirst.length(),stringSecond.length()))
            return true;
        else
            return false;
    }

    private static int getCount(String stringFirst,String stringSecond){
        int count=0;
        char[] arrayOne=stringFirst.toCharArray();
        char[] arrayTwo=stringSecond.toCharArray();
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if(i!=j){
                    continue;
                }else {
                    if(arrayOne[i]==arrayTwo[j])
                        count++;
                }
            }
        }
        return count;
    }

}
