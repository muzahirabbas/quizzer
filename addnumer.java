package com.seecs.muzahir.e_quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addnumer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnumerical);
    }
    public void onsave(View view)
    {
        EditText statement = (EditText) findViewById(R.id.qstatement);
        EditText marks = (EditText)findViewById(R.id.markx);
        EditText ans = (EditText)findViewById(R.id.ans);
        if (ans.getText().toString().equals("") || statement.getText().toString().equals("") || marks.getText().toString().equals(""))
        {

        }
        else
        {
            serialization.samplequ.statement = statement.getText().toString();
            serialization.samplequ.optionA=ans.getText().toString();
            serialization.samplequ.optionB=ans.getText().toString();
            serialization.samplequ.optionC=ans.getText().toString();
            serialization.samplequ.optionB=ans.getText().toString();
            serialization.samplequ.correct=ans.getText().toString();
            serialization.samplequ.marks=Integer.parseInt(marks.getText().toString());
            serialization.samplequ.type='n';
            serialization.sampleq.addquest(serialization.samplequ);
            serialization.sampleq.grandtotal+=serialization.samplequ.marks;
            serialization.totalq+=1;
            Intent i = new Intent(getApplicationContext(),instructor2.class);
            startActivity(i);
        }
    }
}
