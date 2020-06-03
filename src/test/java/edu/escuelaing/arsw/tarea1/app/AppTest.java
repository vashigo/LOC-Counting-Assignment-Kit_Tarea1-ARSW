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
     * test File Reader By Medium Case LOC 
     *
     * @result number of lines in the file by method LOC
     */
    public void testFileReaderByMediumCaseLOC()
    {   
        String readType = "loc";
        String file = "src/test/resources/Prueba2.java";
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType, file, lc);
        System.out.println(lc.getLineCount());
        assertTrue( 55 == lc.getLineCount()); 
    }
    
    /**
     * test File Reader By Medium Case PHY 
     *
     * @result number of lines in the file by method PHY
     */
    public void testFileReaderByMediumCasePHY()
    {   
        String readType = "phy";
        String file = "src/test/resources/Prueba2.java";
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType, file, lc);
        System.out.println(lc.getLineCount());
        assertTrue( 95 == lc.getLineCount());   
    }
    
    /**
     * test File Reader By easy Case LOC 
     *
     * @result number of lines in the file by method LOC
     */    
    public void testFileReaderByEasyCaseLOC()
    {   
        String readType = "loc";
        String file = "src/test/resources/Prueba1.java";
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType, file, lc);
        System.out.println(lc.getLineCount());
        assertTrue( 15 == lc.getLineCount()); 
    }
    
    /**
     * test File Reader By easy Case PHY 
     *
     * @result number of lines in the file by method PHY
     */
    public void testFileReaderByEasyCasePHY()
    {   
        String readType = "phy";
        String file = "src/test/resources/Prueba1.java";
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType, file, lc);
        System.out.println(lc.getLineCount());
        assertTrue( 21 == lc.getLineCount());   
    }
}