import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    private Library library;
    private Book watchmen;
    private Book vendetta;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
        vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
        book3 = new Book("some book", "Alan Moore", "Graphic Novel");

    }

    @Test
    public void stockEmpty(){
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(watchmen);
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void addBookFullCapacity(){
        library.addBook(watchmen);
        library.addBook(watchmen);
        assertEquals(1, library.getStockCount());
        assertNotNull(watchmen);
    }

    @Test
    public void removeBook(){
        library.addBook(watchmen);
        library.addBook(vendetta);
        library.addBook(book3);
        library.removeBook(vendetta);
        assertEquals(2, library.getStockCount());

    }



}
