import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    //defining variables but not actually assiging a value
    //if i was going to pass in capacity each time i created a new library
    // i could then do this.capacity = capacity
    //same goes for an array of books
    private int capacity;
    private Book book;
    private ArrayList<Book> books;
    private Borrower borrower;
    private HashMap<String, Integer> genres;


    public Library(){
        this.capacity = 3;
//        this.book = new Book();
        this.books = new ArrayList<>();
        genres = new HashMap<String, Integer>();
    }


    public int getStockCount() {
        return this.books.size();
    }

//    public boolean atCapacity(){
//
//    }

    public void addBook(Book book) {
        int bookCount = getStockCount();
        if(this.capacity > bookCount )
        this.books.add(book);
        updateGenreHashMap(book);
    }

    public Book removeBook(Book book) {

        int bookIndex = this.books.indexOf(book);
        return this.books.remove(bookIndex);
    }

    public void updateGenreHashMap(Book book){
        String genre = book.getGenre();
        if(this.genres.containsKey(genre)){
            int count = genres.get(genre);
            count ++;
            this.genres.put(genre, count);
        }
        else{
            this.genres.put(genre, 1);
        }
    }

    public int getGenreCount(String genre) {
        if(genres.containsKey(genre)) {
            return this.genres.get(genre);
        }
        return 0;
    }




}
