package Codes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;
    Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
        user = new User("UserName1", library);
    }

    @After
    public void tearDown() throws Exception {
        user = null;
        library = null;
    }

    @Test(expected = Exception.class)
    public void book_lend_exception() throws Exception {
        user.book_lend(new Book("ABC", 1, library));
    }

    @Test(expected = Exception.class)
    public void book_return_exception() throws Exception {
        user.book_return(new Book("ABC", 1, library));
    }

    @Test
    public void book_lend(){
        library.addBook("Book1", 1);
        try {
            Book book = user.book_lend(new Book("Book1", 1, library));
            assertEquals("", book, new Book("Book1", 1, library));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void book_return() {
        library.addBook("Book2", 1);
        try {
            Book book = user.book_lend(new Book("Book2", 1, library));
            Book returnedBook = user.book_return(new Book("Book2", 1, library));
            assertEquals("", returnedBook, new Book("Book2", 1, library));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}