/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seecs.muzahir.e_quizzer;
import java.io.Serializable;
/**
 *
 * @author Mushaf Ali
 */
public class question implements Serializable{
    public int marks;
    public String statement;
    public String optionA;
    public String optionB;
    public String optionC;
    public String optionD;
    public String correct;
    public char type;
    question(){
        optionA="a";
        optionB="b";
        optionC="c";
        optionD="d";
        correct="x";
        statement="statement";
        type='x';
        marks=0;
    }
}
