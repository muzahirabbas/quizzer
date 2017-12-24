/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seecs.muzahir.e_quizzer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class quiz implements Serializable{
    public List<question> quest  = new ArrayList<>();
    public int totalquestions;
    public int grandtotal;
    public String title;
    public int totalq;
     public quiz() {
         title = "temp";
         totalq=0;
        totalquestions=0;
        grandtotal=0;
    }
      public void addquest(question newquest){
          totalquestions++;
          grandtotal+= newquest.marks;
        quest.add(newquest);
    }
    public void removequest(int index){
        quest.remove(index);
        totalquestions--;
    }
    public void addquest(question newquest, int index){
        quest.add(index, newquest);
        grandtotal+= newquest.marks;
        totalquestions++;
    }
}
