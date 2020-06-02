package edu.escuelaing.arsw.tarea1.app;

import edu.escuelaing.arsw.tarea1.app.linecounter.*;
import static junit.framework.Assert.assertTrue;
import junit.framework.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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
     * Rigourous Test the main method
     */
    public void testFileReaderByLOC()
    {   
        String readType = "loc";
        String file = "src/test/resources/Prueba2.java";
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType, file, lc);
        System.out.println(lc.getLineCount());
        assertTrue( 56 == lc.getLineCount());   
    }
    public void testFileReaderByPHY()
    {   
        String readType = "phy";
        String file = "src/test/resources/Prueba2.java";
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType, file, lc);
        System.out.println(lc.getLineCount());
        assertTrue( 95 == lc.getLineCount());   
    }
}