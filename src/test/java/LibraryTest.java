import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    
    Library library;
    Book book;
    
    @Before
    public void setUp(){
        library = new Library();
        book = new Book("Tom Sawyer", "Mark Twain", "Adventure");
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void bookIsAddedToLibrary() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void bookNotaddedIfLibraryAtCapacity() {
        for (int i = 0; i < 11; i++) {
            library.addBook(book);
        }
        assertEquals(10, library.countBooks());
    }

    @Test
    public void canRemoveBookFromLibrary() {
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.countBooks());
    }
}
