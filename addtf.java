package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class addtf extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtf);
    }
    public void onsave(View view)
    {
        EditText statement = (EditText) findViewById(R.id.qstatement);
        EditText marks = (EditText)findViewById(R.id.markx);
        ToggleButton ans = (ToggleButton) findViewById(R.id.torf);
        if (ans.getText().toString().equals("") || statement.getText().toString().equals("") || marks.getText().toString().equals(""))
        {

        }
        else
        {
            serialization.samplequ.optionA=ans.getText().toString();
            serialization.samplequ.optionB=ans.getText().toString();
            serialization.samplequ.optionC=ans.getText().toString();
            serialization.samplequ.optionB=ans.getText().toString();
            serialization.samplequ.correct=ans.getText().toString();
            serialization.samplequ.marks=Integer.parseInt(marks.getText().toString());
            serialization.samplequ.type='t';
            serialization.sampleq.addquest(serialization.samplequ);
            serialization.sampleq.grandtotal+=serialization.samplequ.marks;
            serialization.totalq+=1;
            Intent i = new Intent(getApplicationContext(),instructor2.class);
            startActivity(i);
        }
    }
}
