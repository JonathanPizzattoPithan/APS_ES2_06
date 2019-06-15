package Maven.APs_GB;

import Maven.APs_GB.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private App Helo;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void setUp() {
    	Helo = new App();
    }
    
    public void testString() {
    	assertEquals("Hello, World", Helo.TesteA(null));
    }
    
    public void testApp()
    {
        assertTrue( true );
    }
}
