package mike.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    public void testSetNameSameAsGetName()
    {
        String name = "Fred";
        App app = new App("Fred");

        assertEquals(name, app.getName());
    }

    public void testFormatGetFullName()
    {
    	String fullName = "Joseph Zona";
    	Employee joe = new Employee("Joseph", "Zona", 10000);

    	assertEquals(fullName, joe.getFullName());
    }
}
