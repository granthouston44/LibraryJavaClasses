import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    private Library library;
    private Book watchmen;
    private Book vendetta;
    private Book book3;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
        vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
        book3 = new Book("some book", "Alan Moore", "Noir");
        borrower = new Borrower();
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
        library.addBook(watchmen);
        library.addBook(watchmen);
        assertEquals(3, library.getStockCount());
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

//    @Test
//    public void canGiveBookToBorrower(){
//        library.addBook(watchmen);
//        library.addBook(vendetta);
//        library.addBook(book3);
//        library.giveBookToBorrower(vendetta);
//        assertEquals(2, library.getStockCount());
//        assertEquals(1, borrower.getBorrowedBookCount());
//    }

    @Test
    public void genreHashMapUpdatesOnBookAdded(){
        library.addBook(watchmen);
        library.addBook(vendetta);
        library.addBook(book3);

        assertEquals(2, library.getGenreCount("Graphic Novel"));
        assertEquals(1, library.getGenreCount("Noir"));
    }

    @Test
    public void genreHashMapSearchMissingGenre(){
        library.addBook(watchmen);
        library.addBook(vendetta);
        library.addBook(book3);

        assertEquals(0, library.getGenreCount("Drama"));
    }

}
