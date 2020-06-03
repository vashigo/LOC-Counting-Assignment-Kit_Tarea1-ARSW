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

    /**
     * read File.
     *
     * this command will read line by line the file where it will analyze
     * according to whether it is "phy" or "loc" it will proceed to the check
     * and will execute the sums of the line
     *
     * @param readType - the type of file reading if it is by 'phy' or by 'loc'.
     * @param filePath - The path of file to read.
     * @param lc - The class LineCounter, who will be responsible for keeping
     * track of the lines
     */
    public void readFile(String readType, String filePath, LineCounter lc) {
        Charset charset = Charset.forName("UTF-8");
        Path file= Paths.get(filePath);
        
        if (validateReadType(readType)) {
            try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    
                    if ((!isCommentLine(line)) && (readType.equals("loc"))) {
                        lc.count(line);
                        
                    }
                    if(readType.equals("phy")){
                        lc.count(line);
                    } 
                }
            } catch (Exception x) {
                System.err.format("IOException: %s%n", x);
            }
        }else{
            System.out.println("you have to enter first value 'loc' or 'phy' you have: " + readType);
        }
    }

    /**
     * validate read type.
     *
     * this command verifies that readtype is exclusively "phy" or "loc"
     *
     * @param type - the type of file reading if it is by 'phy' or by 'loc'.
     * @return true if is 'phy' or 'loc' and false if not
     */
    private boolean validateReadType(String type) {

        boolean isValidate = false;

        if(type.equals("loc") || type.equals("phy") ){
            isValidate = true;
        }

        return isValidate;
    }    

    /**
     * read File.
     *
     * this command will read line by line the file where it will analyze
     * according to whether it is "phy" or "loc" it will proceed to the check
     * and will execute the sums of the line
     *
     * @param line - the line x of the file in string format.
     * @return true if the line is a comment or false if not.
     */
    private boolean isCommentLine(String line) {

        boolean isComment = false;
        
        if(line.replace(" ","").isEmpty() 
                || (line.contains("/*") 
                || line.contains("/**") 
                || line.contains("*") 
                || line.contains("//")
                )){
            isComment = true;
        }

        return isComment;
    }
}