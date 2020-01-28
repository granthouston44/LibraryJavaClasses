import org.junit.Before;

public class BookTest {

    private Book watchmen;
    private Book vendetta;

    @Before
    public void before(){
        watchmen = new Book("The Watchmen", "Alan Moore", "Graphic Novel");
        vendetta = new Book("V For Vendetta", "Alan Moore", "Graphic Novel");
    }



}
