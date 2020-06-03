/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.tarea1.app.linecounter;

/**
 *interface that houses the unimplemented methods to count and obtain that value
 * 
 * @author Andres Vasquez
 */
public interface LineCounter {
    /**
     * count.
     *
     * this command will house the logic where it will add and keep count of
     * lines.
     *
     * @param line - the line x of the file in string format.
     */
    public void count(String line);
    
    /**
     * get total LineCount.
     *
     * this command will return the state of the variable where it contains the
     * sums of the lines
     *
     * @return the value within the number of rows counted so far.
     */
    public Integer getLineCount();
}