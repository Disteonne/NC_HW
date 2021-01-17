package HW_JAVA.secondHomeWork.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {

    public void readString(){
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))) {
            String[] array=bufferedReader.readLine().split(" ");
            for (String string:array
                 ) {
                System.out.println(string);
            }
        }catch (IOException exception){
            System.out.println("IO Error");
        }
    }

}
