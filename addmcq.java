package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class addmcq extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmcq);
    }
    public void onsave(View view)
    {
        EditText statement = (EditText) findViewById(R.id.qstatement);
        EditText marks = (EditText)findViewById(R.id.markx);
        EditText opta = (EditText)findViewById(R.id.optA);
        EditText optb = (EditText)findViewById(R.id.optB);
        EditText optc = (EditText)findViewById(R.id.optC);
        EditText optd = (EditText)findViewById(R.id.optD);
        if (opta.getText().toString().equals("") || optb.getText().toString().equals("") || optc.getText().toString().equals("") || optd.getText().toString().equals("") || statement.getText().toString().equals("") || marks.getText().toString().equals(""))
        {

        }
        else
        {
            RadioGroup selectb = (RadioGroup) findViewById(R.id.ansgroup);
            int selectedid = selectb.getCheckedRadioButtonId();
            RadioButton sradio = (RadioButton) findViewById(selectedid);
            serialization.samplequ.statement = statement.getText().toString();
            serialization.samplequ.optionA=opta.getText().toString();
            serialization.samplequ.optionB=optb.getText().toString();
            serialization.samplequ.optionC=optc.getText().toString();
            serialization.samplequ.optionB=optd.getText().toString();
            serialization.samplequ.correct=sradio.getText().toString();
            serialization.samplequ.marks=Integer.parseInt(marks.getText().toString());
            serialization.samplequ.type='m';
            serialization.sampleq.addquest(serialization.samplequ);
            serialization.sampleq.grandtotal+=serialization.samplequ.marks;
            serialization.totalq+=1;
            Intent i = new Intent(getApplicationContext(),instructor2.class);
            startActivity(i);
        }
    }
}
