package edu.escuelaing.arsw.tarea1.app.linecounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File reads a file from the hard drive
 *
 * @author Andres Vasquez
 */
public class FileReader {

    public FileReader() {
    }

    public void readFile(String filePath, LineCounter lc) {
        Charset charset = Charset.forName("UTF-8");
        Path file= Paths.get(filePath);
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                lc.count(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}