package src;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionsDemo {
    public static void show() {
        var reader = new FileReader();
        try{
            reader = new FileReader("file.txt");
            var value = reader.read();
        } 
        catch (IOException | ParseException e){ //with this format you can handle multiple exceptions at the same time
            System.out.println("Could not read data.");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Failed to lead the appropriate classes.");
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
