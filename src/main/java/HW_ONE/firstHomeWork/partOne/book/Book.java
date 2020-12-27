package HW_ONE.firstHomeWork.partOne.book;


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
}
