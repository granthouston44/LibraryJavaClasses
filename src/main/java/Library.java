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
        this.capacity = 3;
//        this.book = new Book();
        this.books = new ArrayList<>();
    }


    public int getStockCount() {
        return this.books.size();
    }

    public ArrayList<Book> getStock(){
        return this.books;
    }

    public void addBook(Book book) {
        int bookCount = getStockCount();
        if(this.capacity > bookCount )
        this.books.add(book);
    }

    public void removeBook(Book book) {

////        int bookIndex = this.books.indexOf(book);
        this.books.remove(book);
    }
}
