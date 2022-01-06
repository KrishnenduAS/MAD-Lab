package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton=findViewById(R.id.button2);
        final TextView myText=findViewById(R.id.text1);
        clickButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                myText.setText("Hello!!");
            }
        });
    }
}
