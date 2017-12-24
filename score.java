package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class score extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        serialize ser = new serialize(cw);
        TextView xscore = (TextView) findViewById(R.id.xscore);
        TextView yscore = (TextView) findViewById(R.id.yscore);
        xscore.setText(serialization.gtotal);
        yscore.setText(ser.all.quizes.get(ser.all.quiznum).grandtotal);
    }
    public void onokay(View view)
    {
        Intent i = new Intent(getApplicationContext(), student.class);
        startActivity(i);
    }
}
