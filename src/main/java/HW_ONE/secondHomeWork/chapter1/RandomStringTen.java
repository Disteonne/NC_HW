package HW_ONE.secondHomeWork.chapter1;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Random;


public class RandomStringTen {

    public String getRandomString(int length){
        int count=0;
        char[] chars=new char[62];
        for (int i = 0; i < 27; i++) {
            chars[i]= (char) (65+count);
            count++;
        }
        count=0;
        for (int i = 27; i < 53; i++) {
            chars[i]=(char) (97+count);
            count++;
        }
        count=0;
        for (int i = 53; i < chars.length; i++) {
            chars[i]=(char) (48+count);
            count++;
        }
        //62 s
        Random randomIndex=new Random();
        StringBuilder randomString=new StringBuilder("");
        for (int i = 0; i < length; i++) {
            randomString.append(""+chars[randomIndex.nextInt(62)]);
        }
        return getRandomStringBase(randomString.toString());
    }

    public String getRandomStringBase(String input){
        byte[] bytes=input.getBytes(StandardCharsets.UTF_8);
        return new BigInteger(1,bytes).toString(36);
    }

    public static void main(String[] args) {
        RandomStringTen randomString=new RandomStringTen();
        System.out.println(randomString.getRandomString(5));
    }
}
