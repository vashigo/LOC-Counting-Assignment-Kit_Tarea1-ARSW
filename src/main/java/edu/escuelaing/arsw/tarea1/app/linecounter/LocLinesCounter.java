package edu.escuelaing.arsw.tarea1.app.linecounter;

/**
 * a implementation of LineCounter
 * 
 * @author Andres Vasquez
 */
public class LocLinesCounter implements LineCounter{
    
    private Integer lineCount=0;

    /**
     * count.
     *
     * this command will house the logic where it will add and keep count of
     * lines.
     *
     * @param line - the line x of the file in string format.
     */
    @Override
    public void count(String line) {
        lineCount++;
    }
    /**
     * get total LineCount.
     *
     * this command will return the state of the variable where it contains the
     * sums of the lines
     *
     * @return the value within the number of rows counted so far.
     */
    @Override
    public Integer getLineCount() {
        return lineCount;
    }
}