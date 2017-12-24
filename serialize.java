package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by zari on 12/24/2017.
 */

public class serialize implements Serializable {
   // public quiz sampleq = new quiz();
    public Context context;
    public allquizzes all = new allquizzes();
    //public question samplequ = new question();
    serialize(ContextWrapper cw){
        try
        {
            File inFile = new File(cw.getCacheDir(), "data.ser");
            // Reading the object from a file
            FileInputStream file = new FileInputStream(inFile);
            ObjectInputStream in;
            in = new ObjectInputStream(file);

            // Method for deserialization of object
            this.all = (allquizzes)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
    public void ser(allquizzes database,ContextWrapper cw){
        try{
            File outFile = new File(cw.getCacheDir(), "data.ser");
            FileOutputStream f = new FileOutputStream(outFile);
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(f);
            oos.writeObject(database);
            oos.close();
            f.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    public void deser(ContextWrapper cw)
    {
        try
        {
            File inFile = new File(cw.getCacheDir(), "data.ser");
            // Reading the object from a file
            FileInputStream file = new FileInputStream(inFile);
            ObjectInputStream in;
            in = new ObjectInputStream(file);

            // Method for deserialization of object
            this.all = (allquizzes)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
