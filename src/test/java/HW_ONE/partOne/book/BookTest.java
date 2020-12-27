package HW_ONE.partOne.book;

import HW_ONE.firstHomeWork.partOne.book.Author;
import HW_ONE.firstHomeWork.partOne.book.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest{


    private Book book=new Book("Alice's Adventures in Wonderland",authors(),1000,2);
    @Test
    public void testTestGetName() {
        assertEquals("Alice's Adventures in Wonderland",book.getName());
    }
    @Test
    public void testGetAuthors() {
        assertEquals("John Tenniel",book.getAuthors()[1].getName());
    }
    @Test
    public void testGetPrice() {
        assertEquals(1000.0,book.getPrice());
    }
    @Test
    public void testGetQty() {
        assertEquals(2,book.getQty());
    }
    @Test
    public void testGetAuthorName() {
        assertEquals("Lewis Carroll,John Tenniel",book.getAuthorName());
    }

    private Author[] authors(){
        Author[] arrayAuthors=new Author[]{
                new Author("Lewis Carroll","carrol@gmail.ru",'m'),
                new Author("John Tenniel","john.tenn@gmail.ru",'m')
        };
        return arrayAuthors;
    }
}

