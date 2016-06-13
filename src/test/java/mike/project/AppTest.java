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
        App app = new App("Bob");

        assertEquals(name, app.getName());
    }
}
