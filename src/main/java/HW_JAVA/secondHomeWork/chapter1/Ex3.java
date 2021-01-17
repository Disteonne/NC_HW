package HW_JAVA.secondHomeWork.chapter1;

public class Ex3 {

    public static String getMinMax(int valueOne,int valueTwo,int valueThree){
        if (valueOne==valueTwo && valueOne==valueThree){
            return "There is no min and max";
        }else {
            if(valueOne>=valueTwo && valueOne>valueThree || valueOne>=valueThree && valueOne>valueTwo ){
                if(valueThree==valueTwo){
                    return "Max: "+valueOne+",Min: "+valueTwo;
                }
                else if(valueThree>valueTwo){
                    return "Max: "+valueOne+",Min: "+valueTwo;
                }else {
                    return "Max: "+valueOne+",Min: "+valueThree;
                }
            }else if(valueTwo>=valueOne && valueTwo>valueThree || valueTwo>=valueThree && valueTwo>valueOne){
                if(valueOne==valueThree){
                    return "Max: "+valueTwo+",Min: "+valueOne;
                }else  if(valueOne>valueThree){
                    return "Max: "+valueTwo+",Min: "+valueThree;
                }else {
                    return "Max: "+valueTwo+",Min: "+valueOne;
                }
            }else {
                if(valueOne==valueTwo){
                    return "Max: "+valueThree+",Min: "+valueOne;
                }else if(valueOne>valueTwo){
                    return "Max: "+valueThree+",Min: "+valueTwo;
                }else {
                    return "Max: "+valueThree+",Min: "+valueOne;
                }
            }
        }
    }

    public static String getMinMaxMath(int valueOne,int valueTwo,int valueThree){
        if(valueOne==valueThree && valueOne==valueTwo){
            return "There is no min and max";
        }else {
            return "Max: "+Math.max(Math.max(valueOne,valueTwo),Math.max(valueOne,valueThree))+",Min: " +
                    ""+Math.min(Math.min(valueOne,valueTwo),Math.min(valueOne,valueThree));
        }
    }
}
