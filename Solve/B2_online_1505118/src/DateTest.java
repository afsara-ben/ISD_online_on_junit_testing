import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {
    Date date;

    @Before
    public void setUp() throws Exception {
        date = new Date();
    }

    @After
    public void tearDown() throws Exception {
        date = null;
    }

    @Test
    public void testDate() throws Exception {

        Date actual = new Date(2019, 6, 10);
        Date expected = new Date(2019, 6, 10);
        assertEquals("checking if two days are equal or not", expected, actual);

        Date actual2 = new Date();
        Date expected2 = new Date(2019, 1, 22);
        assertEquals("checking if two days are equal or not using todays date", expected2, actual2);



    }

    @Test
    public void testAddDays() throws Exception {

        Date actual = new Date(2019, 6, 10);
        actual.addDays(4);
        Date expected = new Date(2019, 6, 14);
        assertEquals("days after 4 days", expected, actual);

    }

    @Test
    public void testGetDayOfWeek() throws Exception {

        Date actual1 = new Date(2019, 1, 22);
        String expected = actual1.getDayOfWeek();
        //Date actual2 = new Date(2019, 6, 14);
        //String expected2 = actual2.getDayOfWeek();
        assertEquals("", expected, "TUESDAY");

    }

    @Test(expected = Exception.class)
    public void add_days_exception() throws Exception {
        date.addDays(-2);

    }

    @Test(expected = Exception.class)
    public void next_day_exception() throws Exception {
        //date.addDays(-2);

    }
    @Test(expected = Exception.class)
    public void get_day_of_week_exception() throws Exception {
        Date actual1 = new Date(2019, 1, 32);
        actual1.getDayOfWeek();

    }

    @Test(expected = Exception.class)
    public void leap_year_exception() throws Exception {
        Date actual = new Date(-2019, 6, 10);
        actual.isLeapYear();
    }



    @Test(timeout = 1000)
    public void testLeapYear() throws Exception {

        Date actual = new Date(2019, 6, 10);
        boolean expected = actual.isLeapYear();
        assertFalse("after considering non leap year", expected);

        Date actual2 = new Date(2016, 6, 10);
        boolean expected2 = actual2.isLeapYear();
        assertTrue("after considering non leap year", expected2);

    }


}