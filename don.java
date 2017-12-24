package com.seecs.muzahir.e_quizzer;

import android.content.ContextWrapper;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class don extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don);
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        serialize ser = new serialize(cw);
        TextView statement = (TextView) findViewById(R.id.qstatement);
        statement.setText(ser.all.quizes.get(ser.all.quiznum).quest.get(ser.all.quizes.get(ser.all.quiznum).totalq-1).statement);
    }
    public void onnextn(View view)
    {
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        serialize ser = new serialize(cw);
        EditText ans = (EditText) findViewById(R.id.ans);
        if (ans.getText().toString().equals(ser.all.quizes.get(ser.all.quiznum).quest.get(ser.all.quizes.get(ser.all.quiznum).totalq-1).optionA)) {
            serialization.gtotal += ser.all.quizes.get(ser.all.quiznum).quest.get(ser.all.quizes.get(ser.all.quiznum).totalq-1).marks;
        }
        if ((ser.all.quizes.get(ser.all.quiznum).totalq==1)) {
            Intent i = new Intent(getApplicationContext(), score.class);
            startActivity(i);
        } else {
            ser.all.quizes.get(ser.all.quiznum).totalq--;
            ContextWrapper cw2 = new ContextWrapper(getApplicationContext());
            ser.ser(ser.all,cw2);
         // ser.deser(cw);
            if (ser.all.quizes.get(ser.all.quiznum).quest.get(ser.all.quizes.get(ser.all.quiznum).totalq-1).type == 'n') {
                Intent x = new Intent(getApplicationContext(), don.class);
                startActivity(x);
            } else if (ser.all.quizes.get(ser.all.quiznum).quest.get(ser.all.quizes.get(ser.all.quiznum).totalq-1).type == 'm') {
                Intent x = new Intent(getApplicationContext(), don.class);
                startActivity(x);
            } else if (ser.all.quizes.get(ser.all.quiznum).quest.get(ser.all.quizes.get(ser.all.quiznum).totalq-1).type == 't') {
                Intent x = new Intent(getApplicationContext(), don.class);
                startActivity(x);
            }
        }
    }
}
