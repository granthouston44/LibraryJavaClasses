import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book watchmen;
    private Book vendetta;

    @Before
    public void before(){
        watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
        vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
    }

    @Test
    public void hasAuthor(){
        assertEquals("The Watchmen", watchmen.getAuthor());
    }




}
