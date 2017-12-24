package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class instructor extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor);
    }
    public void logoutf(View view)
    {
        Intent i = new Intent(getApplicationContext(),login.class);
        startActivity(i);
    }
    public void oncreateb(View view)
    {
        EditText qtitle = findViewById(R.id.qstitle);
        serialization.gtitle=qtitle.getText().toString();
        Intent i = new Intent(getApplicationContext(),instructor2.class);
        startActivity(i);
    }
}
