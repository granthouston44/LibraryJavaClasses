import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

private Borrower borrower;
private Book watchmen;
private Book vendetta;
private Book book3;
private Library library;

@Before
    public void before(){
    borrower = new Borrower();
    watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
    vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
    book3 = new Book("somebook", "Alan Moore", "Graphic Novel");
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
        library.addBook(book3);
        borrower.borrow(vendetta, library);
        assertEquals(2, library.getStockCount());
        assertEquals(1, borrower.getBorrowedBookCount());

    }

}
