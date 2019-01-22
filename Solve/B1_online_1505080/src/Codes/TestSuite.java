package Codes;

import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({LibraryTest.class, BookTest.class, UserTest.class})
public class TestSuite {
}
