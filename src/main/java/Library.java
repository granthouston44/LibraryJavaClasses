import java.util.ArrayList;

public class Library {

    //defining variables but not actually assiging a value
    //if i was going to pass in capacity each time i created a new library
    // i could then do this.capacity = capacity
    //same goes for an array of books
    private int capacity;
    private Book book;
    private ArrayList<Book> books;

    public Library(){
        this.capacity = 1;
//        this.book = new Book();
        this.books = new ArrayList<>();
    }


    public int getStock() {
        return this.books.size();
    }

    public void addBook(Book book) {
        int bookCount = getStock();
        if(this.capacity > bookCount )
        this.books.add(book);
    }
}
