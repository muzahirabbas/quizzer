package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class domcq extends Activity {
    serialize ser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domcq);
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        ser = new serialize(cw);
        TextView statement = (TextView) findViewById(R.id.qstatement);
        TextView a = (TextView) findViewById(R.id. opta);
        TextView b = (TextView) findViewById(R.id.optb);
        TextView c = (TextView) findViewById(R.id.optc);
        TextView d = (TextView) findViewById(R.id.optd);
        a.setText(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).optionA);
        b.setText(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).optionB);
        c.setText(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).optionC);
        d.setText(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).optionD);
        statement.setText(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).statement);
    }
    public void onnext(View view)
    {
        RadioGroup selectb = (RadioGroup) findViewById(R.id.ansgroup);
        int selectedid = selectb.getCheckedRadioButtonId();
        RadioButton sradio = (RadioButton) findViewById(selectedid);
        if (sradio.getText().toString().equals(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).correct)) {
            serialization.gtotal += ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).marks;
        }
        if (serialization.totalq == (ser.all.quizes.get(serialization.quiznum).totalquestions-1))
        {
            Intent i = new Intent(getApplicationContext(), score.class);
            startActivity(i);
        }
        else
        {
            serialization.totalq++;
            if (ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).type == 'n') {
                Intent i = new Intent(getApplicationContext(), donumerical.class);
                startActivity(i);
            } else if (ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).type == 'm') {
                Intent i = new Intent(getApplicationContext(), domcq.class);
                startActivity(i);
            } else if (ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).type == 't') {
                Intent i = new Intent(getApplicationContext(), dotf.class);
                startActivity(i);
            }
        }
    }
}
