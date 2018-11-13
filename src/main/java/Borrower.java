import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> selection;

    public Borrower(String name) {
        this.name = name;
        this.selection = new ArrayList<Book>();
    }

    public int countCollection() {
        return this.selection.size();
    }

    public void addBookToSelection(Book book) {
        this.selection.add(book);
    }

    public void borrowBook(Library library) {
        Book borrowedBook = library.removeBook();
        this.addBookToSelection(borrowedBook);
    }
}
