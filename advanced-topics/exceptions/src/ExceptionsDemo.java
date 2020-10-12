package src;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try{
            reader = new FileReader("file.txt");
            var value = reader.read();
        } 
        catch (IOException e){ //with this format you can handle multiple exceptions at the same time
            System.out.println("Could not read data.");
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
