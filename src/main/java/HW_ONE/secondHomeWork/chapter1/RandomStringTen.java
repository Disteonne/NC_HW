package HW_ONE.secondHomeWork.chapter1;

import java.util.Random;

//ВЫХОДНАЯ СТРОКА ДОЛЖНА СОДЕРЖАТЬ 36 СИМВОЛОВ?
public class RandomStringTen {

    public String getRandomString(){
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

        Random randomIndex=new Random();
        StringBuilder randomString=new StringBuilder("");
        for (int i = 0; i < 36; i++) {
            randomString.append(""+chars[randomIndex.nextInt(62)]);
        }
        return randomString.toString();
    }

    public static void main(String[] args) {
        RandomStringTen randomString=new RandomStringTen();
        System.out.println(randomString.getRandomString());
    }
}
