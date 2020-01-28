import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookTest {

    private Book watchmen;
    private Book vendetta;

    @Before
    public void before(){
        watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
        vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
    }

    @Test
    public void hasName(){
        assertEquals("The Watchmen", watchmen.getName());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Alan Moore", watchmen.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Graphic Novel", watchmen.getGenre());
    }



}
