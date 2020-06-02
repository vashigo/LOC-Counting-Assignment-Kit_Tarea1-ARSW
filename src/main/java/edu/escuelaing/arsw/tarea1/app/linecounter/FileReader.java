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
            } catch (IOException x) {
                System.err.format("IOException: %s%n", x);
            }
        }
    }
    
    private boolean validateReadType(String type) {

        boolean isValidate = false;
        try{
            if(type.equals("loc") || type.equals("phy") ){
                isValidate = true;
            }
        }catch(Exception e){
            System.out.println("you have to enter first value 'loc' or 'phy' you have: " + type);  
        }
        
        return isValidate;
    }    

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