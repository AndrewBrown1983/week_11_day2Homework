import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("Catch 22", "Joseph Heller", "Satire");
    }

    @Test
    public void getTitleOfBook() {
        assertEquals("Catch 22", book.getTitle());
    }

    @Test
    public void getAuthorOfBook() {
        assertEquals("Joseph Heller", book.getAuthor());
    }

    @Test
    public void getGenreOfBook() {
        assertEquals("Satire", book.getGenre());
    }
}
