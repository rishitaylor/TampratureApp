package com.example.tamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    TextView result;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1= findViewById(R.id.num1);
        result=findViewById(R.id.res);
        add=findViewById(R.id.btn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(num1.getText().toString());
                if (a>10){
                    result.setText("Cool : "+a);
                }
                if (a>20){
                    result.setText("Normal : "+a);

                }
                if (a>30){
                    result.setText("Hot : "+a);
                }
            }
        });
    }
}
