package HW_ONE.partOne.book;

import junit.framework.TestCase;

public class BookTest extends TestCase {

    private Author a1=new Author("Lewis Carroll","carrol@gmail.ru",'m');//m->male
    private Author a2=new Author("John Tenniel","john.tenn@gmail.ru",'m');

    private Book book=new Book("Alice's Adventures in Wonderland",authors(a1,a2),1000,2);
    public void testTestGetName() {
        assertEquals("Alice's Adventures in Wonderland",book.getName());
    }

    public void testGetAuthors() {
        Author[] a=book.getAuthors();
        assertEquals("John Tenniel",a[1].getName());
    }

    public void testGetPrice() {
        assertEquals(1000.0,book.getPrice());
    }

    public void testGetQty() {
        assertEquals(2,book.getQty());
    }

    public void testGetAuthorName() {
        assertEquals("Lewis Carroll,John Tenniel",book.getAuthorName());
    }

    private Author[] authors(Author... a){
        Author[] arrayAuthors=a;
        return arrayAuthors;
    }
}