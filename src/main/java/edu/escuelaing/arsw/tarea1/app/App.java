package edu.escuelaing.arsw.tarea1.app;
import edu.escuelaing.arsw.tarea1.app.linecounter.*;

/**
 * main
 */
public class App 
{
    public static void main( String[] args )
    {
        String file = args[0];
        FileReader fr= new FileReader();
        LineCounter lc = new LocLinesCounter();        
        fr.readFile(file, lc);
        System.out.println("Physical Lines: " + lc.getLineCount());
    }
}