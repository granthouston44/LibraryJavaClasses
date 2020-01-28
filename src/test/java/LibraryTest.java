import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book watchmen;

    @Before
    public void before(){
        library = new Library();
        watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
    }

    @Test
    public void stockEmpty(){
        assertEquals(0, library.getStock());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(watchmen);
        assertEquals(1, library.getStock());
    }

    @Test
    public void addBookFullCapacity(){
        library.addBook(watchmen);
        library.addBook(watchmen);
        assertEquals(1, library.getStock());


    }



}
