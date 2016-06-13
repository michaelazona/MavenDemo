package mike.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    public void testFormatGetFullName()
    {
    	String fullName = "Joseph Zona";
    	Employee joe = new Employee("Joseph", "Zona", 10000);

    	assertEquals(fullName, joe.getFullName());
    }

    public void testEarningsAfterTenYears()
    {
    	int salary = 100000;
    	Employee joe = new Employee("Joseph", "Zona", 10000);

    	assertEquals(salary, joe.getEarningsAfterTenYears());
    }
}
