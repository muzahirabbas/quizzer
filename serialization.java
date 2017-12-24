
package com.seecs.muzahir.e_quizzer;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class serialization {
    public static int gmarks=0;
    public static int gtotal=0;
    public static String gtitle;
    public static char type='x';
    public static int totalq=0;
    public static int quiznum;
    public static quiz sampleq = new quiz();
    //public allquizzes all = new allquizzes();
    public static question samplequ = new question();
    void serialization(){
    }



}
