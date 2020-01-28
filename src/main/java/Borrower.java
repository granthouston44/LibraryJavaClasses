import java.util.ArrayList;

public class Borrower {

    private Book book;
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public int getBorrowedBookCount() {
        return this.borrowedBooks.size();
    }

    public void borrow(Book book) {
        this.borrowedBooks.add(book);
    }
}
