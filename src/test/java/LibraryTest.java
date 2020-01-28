import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void stockEmpty(){
        assertEquals(0, library.getStock());
    }

    @Test
    public void stockCount(){
        assertEquals(2, library.getStock());
    }

}
