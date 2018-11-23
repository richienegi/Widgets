package com.example.ritika.widgets;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AtocompletText extends AppCompatActivity {
AutoCompleteTextView mact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atocomplet_text);
        mact=findViewById(R.id.act);
        String lng[]={"Andoid","java","ASP.NET","Word press","Data Structure"};
        ArrayAdapter ar=new ArrayAdapter(AtocompletText.this,android.R.layout.select_dialog_item,lng);
        mact.setAdapter(ar);
        mact.setHintTextColor(Color.RED);
        mact.setTextColor(Color.BLUE);
    }
}
