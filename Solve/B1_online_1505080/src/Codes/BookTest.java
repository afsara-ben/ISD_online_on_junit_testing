package Codes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
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
    public void available_books() {
        assertEquals("Not added any book yet", 0, new Book("ABC", 1, library).getNumber_of_copy());

        library.addBook("DEF", 1);
        assertEquals("Added 1 book", 1, new Book("DEF", 1, library).getNumber_of_copy());


    }
}