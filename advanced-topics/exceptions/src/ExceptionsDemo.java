package src;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        try (var reader = new FileReader("file.txt");
             var writer = new FileWriter("...");
        ) {
            //try with resources statement
            //when we compile this code,it will add a finally block
            var value = reader.read();
        } 
        catch (IOException e){ //with this format you can handle multiple exceptions at the same time
            System.out.println("Could not read data.");
        }
        // finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //         } catch (IOException ex){
        //             ex.printStackTrace();
        //         }
        //     }
        // }
    }
}
