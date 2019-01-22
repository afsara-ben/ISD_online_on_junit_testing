import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Tests {
Library l;
User u1;
User u2;
Book b1;
Book b2;
Book b3;
    @Before
    public void setUp()  {
        l=new Library();
        u1=l.addUser("A");
        u2=l.addUser("B");
        b1=l.addBook("B1",5);
        b2=l.addBook("B2",0);
        b3=l.addBook("B3",2);

    }
    @Test
    public  void testnumberofcopies(){
        assertEquals(5,b1.get_num_of_copy());
        assertEquals(0,b2.get_num_of_copy());
        assertEquals(2,b3.get_num_of_copy());

    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public  void testlendbook1(){


        u2.Book_lend(b2);



    }
    @Test
    public  void testlendbook(){

        u2.Book_lend(b1);
        u1.Book_lend(b1);
        u1.Book_lend(b3);




    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public  void testlreturnbook1(){
        u2.Book_return(b3);




    }
    @Test
    public  void testlreturnbook(){
        u1.Book_lend(b1);
        u1.Book_return(b1);


    }

    @Test
    public  void testisavailable(){

    assertEquals(false,l.isAvailable(b2));
    assertEquals(true,l.isAvailable(b3));


    }
    @Test (timeout = 5000)
    public  void testgetbookist(){
    l.get_book_list();


    }






}
