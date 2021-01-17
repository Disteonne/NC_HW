package HW_JAVA.secondHomeWork.chapter3.Eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortWithComp {

    public void luckySort(ArrayList<String> strings, Comparator<String> comp){
        ArrayList<String> newList=new ArrayList<>();
        Collections.copy(strings,newList);
        Collections.sort(newList,comp);
        while (!newList.equals(strings)){
            Collections.shuffle(strings);
        }
    }
}
