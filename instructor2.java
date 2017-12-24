package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class instructor2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor2);
        TextView qadded = findViewById(R.id.qadded);
        qadded.setText(Integer.toString(serialization.totalq));
        TextView title = findViewById(R.id.qstitle);
        title.setText(serialization.gtitle);
    }
    public void numer(View view){
        Intent i = new Intent(getApplicationContext(), addnumer.class);
        startActivity(i);
    }
    public void tf(View view){
        Intent i = new Intent(getApplicationContext(), addtf.class);
        startActivity(i);
    }
    public void mcq(View view){
        Intent i = new Intent(getApplicationContext(), addmcq.class);
        startActivity(i);
    }
    public void onfinish(View view)
    {
        if (serialization.totalq>0)
        {
            ContextWrapper cw = new ContextWrapper(getApplicationContext());
            serialize ser = new serialize(cw);
            serialization.sampleq.totalquestions = serialization.totalq;
            serialization.sampleq.title = serialization.gtitle;
            ser.all.addquiz(serialization.sampleq);
            ser.ser(ser.all,cw);
            //serialization.all = serialization.deser();
            Intent i = new Intent(getApplicationContext(), instructor.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(getApplicationContext(), instructor.class);
            startActivity(i);
        }
    }
}
