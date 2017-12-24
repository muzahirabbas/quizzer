package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class dotf extends Activity {
    serialize ser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dotf);
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        ser = new serialize(cw);
        TextView statement = (TextView) findViewById(R.id.qstatement);
        statement.setText(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).statement);
    }
    public void onnext(View view)
    {
        ToggleButton torf = (ToggleButton) findViewById(R.id.torf);
        if (torf.getText().toString().equals(ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).optionA))
        {
            serialization.gtotal+=ser.all.quizes.get(serialization.quiznum).quest.get(serialization.totalq).marks;
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
