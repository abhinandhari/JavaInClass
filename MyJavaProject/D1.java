import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import  java.time.LocalDateTime;
public class D1{
    public static void main(String[] args) {
        FirstFrame F = new FirstFrame();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); 
        LocalDateTime now = LocalDateTime.now();
        try{
            File file = new File("log.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("EXECUTION BEGAN - "+formatter.format(now)+"\n"); 
            writer.close(); 
        }catch(IOException e){
            e.printStackTrace();}
        finally{
            
        }  
    }
}