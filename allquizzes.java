/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seecs.muzahir.e_quizzer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mushaf Ali
 */
public class allquizzes implements Serializable{
    public List<quiz> quizes = new ArrayList<>();
    public int totalquizes;
    public int quiznum;
    public allquizzes() {
        totalquizes = 0;
        quiznum=0;
    }
    public void addquiz(quiz newquiz){
        totalquizes++;
        quizes.add(newquiz);
    }
}
