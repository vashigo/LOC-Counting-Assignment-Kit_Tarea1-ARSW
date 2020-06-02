/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.tarea1.app.linecounter;

/**
 *
 * @author Andres Vasquez
 */
public interface LineCounter {
    public void count(String line);
    public Integer getLineCount();
}