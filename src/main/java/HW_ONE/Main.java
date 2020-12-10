package HW_ONE;

import HW_ONE.book.Author;

public class Main {
    public static void main(String[] args) {
        String str="mandarin";
        System.out.println(str.substring(0,str.length()-1));
        Author author[]=new Author[2];
        author[0]=new Author("Igor","d@yan.ru",'m');
        author[1]=new Author("kate","k@.ru",'j');
        String str1="";
        for (Author a:author
             ) {
            str1+=a.getName()+" "+a.getEmail()+",";
        }
        str1=str1.substring(0,str1.length()-1);
        System.out.println(str1);
    }
}
