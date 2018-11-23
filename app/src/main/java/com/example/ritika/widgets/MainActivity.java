package com.example.ritika.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.java);
        c2=findViewById(R.id.php);
        c3=findViewById(R.id.android);
        b1=findViewById(R.id.click);
radioGroup=findViewById(R.id.radiogroup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selected);
                if(selected==-1)
                {
                    Toast.makeText(MainActivity.this, "nothing selected", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(MainActivity.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
                }

                StringBuilder s1=new StringBuilder("selected items are:\n");
                if(c1.isChecked())
                {
                    startActivity(new Intent(MainActivity.this,CheckedDemo.class));
                }
                if(c2.isChecked())
                {
                   startActivity(new Intent(MainActivity.this,AtocompletText.class));

                }
                if(c3.isChecked())
                {
                    String s3=c3.getText().toString();
                    s1.append("\n"+s3);
                }
                if(s1!=null && !s1.toString().equals("")) {
                    Toast.makeText(MainActivity.this, s1, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "please select value", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
