import java.time.format.DateTimeFormatter;
import JavaObjects.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import  java.time.LocalDateTime;
public class D1{
    public static void main(String[] args) {
        FirstFrame F = new FirstFrame();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); 
        LocalDateTime now = LocalDateTime.now();
        try{
            File file = new File("C:/Users/Abhinand Hari/Desktop/myjavaproject/files/log.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("EXECUTION BEGAN - "+formatter.format(now)+"\n"); 
            writer.close(); 
        }catch(IOException e){
            e.printStackTrace();}
        finally{
            AdminWriter();
            ProductWriter();
            System.out.println("Working");
        }
        File f = new File("Files//Cart.dat");
        f.delete();
        try {
                    f.createNewFile();  
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

    }
        private static void AdminWriter(){
        Admin example = new Admin("example","example123@gmail.com","1234");
        Admin example2 = new Admin("root","email@email.com","oops?");
        try{
        FileOutputStream output = new FileOutputStream(new File("Files//Admins.dat"));
        ObjectOutputStream op = new ObjectOutputStream(output);
        op.writeObject(example);
        op.writeObject(example2);
        FileInputStream fi = new FileInputStream(new File("Files//Admins.dat"));
        ObjectInputStream oi = new ObjectInputStream(fi);
        Admin e = (Admin) oi.readObject();
        Admin e2 = (Admin) oi.readObject();
        System.out.println(e);
        System.out.println(e2);
        op.close();
        output.close();
        fi.close();
        oi.close();
        }
        catch(Exception e){e.printStackTrace();}
          
        }
        private static void ProductWriter(){
        Product a1 = new Product(25,"Cavins");
        Product a2 = new Product(5,"Munch");
        try{
        FileOutputStream output = new FileOutputStream(new File("Files//Product.dat"));
        ObjectOutputStream op = new ObjectOutputStream(output);
        op.writeObject(a1);
        op.writeObject(a2);
        FileInputStream fi = new FileInputStream(new File("Files//Product.dat"));
        ObjectInputStream oi = new ObjectInputStream(fi);
        Product e = (Product) oi.readObject();
        Product e2 = (Product) oi.readObject();
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);
        output.close();
        op.close();
        fi.close();
        oi.close();
        }
        catch(Exception e){e.printStackTrace();}
        }
}