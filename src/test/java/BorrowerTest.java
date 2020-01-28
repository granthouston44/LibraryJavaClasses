import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

private Borrower borrower;
private Book watchmen;
private Book vendetta;
private Library library;

@Before
    public void before(){
    borrower = new Borrower();
    watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
    vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
    library = new Library();
}

@Test
public void numberOfBorrowedBooks(){
assertEquals(0, borrower.getBorrowedBookCount());
}

@Test
    public void canBorrowBook(){
    borrower.borrow(vendetta, library);
    assertEquals(1 , borrower.getBorrowedBookCount());
}

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(watchmen);
        library.addBook(vendetta);
        borrower.borrow(vendetta, library);
        assertEquals(1, library.getStockCount());
        assertEquals(1, borrower.getBorrowedBookCount());
    }

}
