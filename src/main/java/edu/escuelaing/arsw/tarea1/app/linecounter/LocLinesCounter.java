package edu.escuelaing.arsw.tarea1.app.linecounter;

/**
 *
 * @author Andres Vasquez
 */
public class LocLinesCounter implements LineCounter{
    
    private Integer lineCount=0;

    @Override
    public void count(String line) {
        lineCount++;
    }

    @Override
    public Integer getLineCount() {
        return lineCount;
    }
}