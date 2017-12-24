package com.seecs.muzahir.e_quizzer;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import java.io.Console;

public class login extends AppCompatActivity {
    private String TAG = "MYTAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.d(TAG, "Error checking");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        serialization.totalq=0;
        serialization.gtotal=0;
    }
    public void lnonclick(View view){
       // Log.d(TAG, "After Button Click");
        EditText uname = (EditText) findViewById(R.id.uname);
        EditText upass = (EditText) findViewById(R.id.pass);
        if (uname.getText().toString().equals("") || upass.getText().toString().equals(""))
        {
            TextView errorv =(TextView) findViewById(R.id.errorv);
            errorv.setText("Missing Field");
            return;
        }
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.lsbutton);
        RadioGroup selectb = (RadioGroup) findViewById(R.id.selectb);
        if (toggleButton.isChecked())
        {

        }
        else
        {
            int selectedid = selectb.getCheckedRadioButtonId();
            RadioButton sradio = (RadioButton) findViewById(selectedid);
            if (sradio.getText().equals("Student"))
            {
                Intent i = new Intent(getApplicationContext(), student.class);
                startActivity(i);
            }
            else
            {
                Intent i = new Intent(getApplicationContext(), instructor.class);
                startActivity(i);
            }
        }

    }
}
