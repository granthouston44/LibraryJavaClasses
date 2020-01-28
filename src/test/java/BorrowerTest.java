import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

private Borrower borrower;
private Book watchmen;
private Book vendetta;

@Before
    public void before(){
    borrower = new Borrower();
    watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
    vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
}

@Test
public void numberOfBorrowedBooks(){
assertEquals(0, borrower.getBorrowedBookCount());
}

@Test
    public void canBorrowBook(){
    borrower.borrow(vendetta);
    assertEquals(1 , borrower.getBorrowedBookCount());
}



}
