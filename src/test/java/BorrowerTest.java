import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    
    Borrower borrower;
    Book book;
    Library library;
    
    @Before
    public void setup(){
        borrower = new Borrower("Andrew");
        book = new Book("To Kill A Mockingbird", "Harper Lee", "Southern Gothic");
        library = new Library();
    }

    @Test
    public void selectionIsEmpty() {
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBookToSelection(book);
        assertEquals(1, borrower.countCollection());
    }

    @Test
    public void canTakeBookFromLibrary() {
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countCollection());

    }
}
