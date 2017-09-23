/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Mushaf Ali
 */
public class serialization {
    public static int gmarks=0;
    public static int gtotal=0;
    public static String gtitle;
    public static quiz sampleq = new quiz();
    public static allquizzes all = new allquizzes();
    public static question samplequ = new question();
    public static quiz gquiz = new quiz();
    public static int totalq;
    void serialization(){
    }
public static void ser(allquizzes database){
    try{ 
      FileOutputStream f; 
        f = new FileOutputStream("data.ser",false);
      ObjectOutputStream oos;
        oos = new ObjectOutputStream(f);
      oos.writeObject(database);
      oos.close();
      f.close();
   }catch(IOException ioe){
      System.out.println(ioe);
    }
}   
public static allquizzes deser(){
    allquizzes object1 = new allquizzes();
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file;
        file = new FileInputStream("data.ser");
            ObjectInputStream in;
        in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            object1 = (allquizzes)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        /**if (!object1.quizes.isEmpty())
        {
        for (int i=0;i<object1.quizes.size();i++)
        {
            System.out.print(object1.quizes.get(i).title);
            if (!object1.quizes.get(i).quest.isEmpty())
            {
            for(int j=0;i<object1.quizes.get(i).quest.size();j++)
            {
               System.out.print(object1.quizes.get(i).quest.get(j).statement);
               System.out.print(object1.quizes.get(i).quest.get(j).optionA);
               System.out.print(object1.quizes.get(i).quest.get(j).optionB);
               System.out.print(object1.quizes.get(i).quest.get(j).correct);
               System.out.print(object1.quizes.get(i).quest.get(j).marks);
            }
            }
        }
        }**/
   return object1; 
}
}
