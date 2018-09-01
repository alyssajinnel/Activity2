package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnResult = (Button) findViewById(R.id.btnResult);



        btnResult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText textNum1 = (EditText) findViewById(R.id.textNum1);
                EditText textNum2 = (EditText) findViewById(R.id.textNum2);
                TextView textResult = (TextView) findViewById(R.id.textResult);


                String value1 = textNum1.getText().toString();
                int num1 = Integer.parseInt(value1);
                String value2 = textNum2.getText().toString();
                int num2 = Integer.parseInt(value2);

                if (num1 > num2)
                {
                    textResult.setText("First number is greater than second number.");
                }
                else if (num1 < num2)
                {
                    textResult.setText("Second number is greater than first number.");
                }
                else{
                    textResult.setText("First number is equal to second number.");
                }
            }
        });




    }
}
