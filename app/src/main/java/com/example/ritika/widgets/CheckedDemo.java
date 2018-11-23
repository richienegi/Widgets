package com.example.ritika.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckedDemo extends AppCompatActivity {
    CheckBox cc,cc1,cc2;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked_demo);
        cc=findViewById(R.id.java);
        cc1=findViewById(R.id.php);
        cc2=findViewById(R.id.android);
        b2=findViewById(R.id.click);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder str=new StringBuilder("Selected : \n");
               if(cc.isChecked())
               {
                   String s1=cc.getText().toString();
                   str.append(s1);
               }
               if(cc1.isChecked())
               {String s2=cc.getText().toString();
                   str.append(s2);

               }
               if(cc2.isChecked())
               {
                   String s3=cc.getText().toString();
                   str.append(s3);
               }
                Toast.makeText(CheckedDemo.this, str, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
