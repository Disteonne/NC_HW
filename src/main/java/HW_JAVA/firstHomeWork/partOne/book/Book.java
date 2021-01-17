package HW_JAVA.firstHomeWork.partOne.book;


import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String infoAuthors="";
        for (Author author:getAuthors()
             ) {
            infoAuthors+="Author[name"+author.getName()+",email="+author.getEmail()+",gender="+author.getGender()+"],";
        }
        infoAuthors=infoAuthors.substring(0,infoAuthors.length()-1);

        return "Book[name="+name+",authors={"+infoAuthors+"},price="+price+",qty="+qty+"]";
    }

    public String getAuthorName(){
        String names="";
        for (Author author:getAuthors()
             ) {
            names+=author.getName()+",";
        }
        names=names.substring(0,names.length()-1);
        return names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                qty == book.qty &&
                Objects.equals(name, book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int hashCode=super.hashCode();
        int result=31*hashCode+name.hashCode();
        result=31*result+ (int) price;
        result=31*result+qty;
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}
