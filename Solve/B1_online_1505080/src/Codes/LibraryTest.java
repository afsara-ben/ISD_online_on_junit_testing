package Codes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library;
    @Before
    public void setUp() throws Exception {
        library = new Library();
    }

    @After
    public void tearDown() throws Exception {
        library = null;
    }

    @Test
    public void isAvailable() {

        library.addBook("ABC", 0);
        assertFalse("Testing after adding 0 book", library.isAvailable(new Book("ABC", 0, library)));


        library.addBook("ABC", 1);
        assertTrue("Testing after adding the book", library.isAvailable(new Book("ABC", 0, library)));

        assertFalse("Testing not having added this book", library.isAvailable(new Book("DEF", 2, library)));


    }

    @Test(timeout = 1000)
    public void get_book_list() {
        assertNotNull(library.get_book_list());
    }
}