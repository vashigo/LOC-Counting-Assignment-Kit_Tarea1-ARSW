package edu.escuelaing.arsw.tarea1.app;
import edu.escuelaing.arsw.tarea1.app.linecounter.*;

/**
 * main
 */
public class App 
{
    public static void main( String[] args )
    {
        String readType = args[0];
        String file = args[1];
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(readType,file, lc);
        System.out.println("Physical Lines: " + lc.getLineCount());
    }
}