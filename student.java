package com.seecs.muzahir.e_quizzer;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class student extends Activity {
    serialize ser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        ser = new serialize(cw);
        //Integer.toString
        TextView textv = findViewById(R.id.oht);
        //textv.setText((ser.all.quizes.get(0).quest.get(0).statement));
        if (ser.all.quizes.size()>0)
        {   ListView listView = findViewById(R.id.listt);
        ArrayList<String> titlex = new ArrayList<>();
        for (int i = 0; i < ser.all.quizes.size(); i++) {
            titlex.add(ser.all.quizes.get(i).title);
        }
        String[] titles = titlex.toArray(new String[ser.all.quizes.size()]);
        // String[] titles;
        // titles = new String[] { "Vegetables","Fruits","Flower Buds","Legumes","Bulbs","Tubers" };
        final ListView listview = findViewById(R.id.listt);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, titles);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position = i;
                String value = (String) listview.getItemAtPosition(i);
                for (int j = 0; j < ser.all.quizes.size(); j++) {
                    if (ser.all.quizes.get(j).title.equals(value)) {
                        serialization.totalq = 0;
                        serialization.gtotal = 0;
                        ser.all.quiznum = j;
                        ser.all.quizes.get(ser.all.quiznum).totalq=ser.all.quizes.get(ser.all.quiznum).totalquestions;
                        ContextWrapper cw2 = new ContextWrapper(getApplicationContext());
                        ser.ser(ser.all,cw2);
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
        });
    }
    }
    public void onlogout(View view)
    {
        Intent x = new Intent(getApplicationContext(), login.class);
        startActivity(x);
    }
}
