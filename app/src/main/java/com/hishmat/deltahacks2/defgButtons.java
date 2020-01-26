package com.hishmat.deltahacks2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class defgButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg_buttons);


        Button d = findViewById(R.id.button2);
        d.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("D");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "D");
                } else {
                    textView.setText(textView.getText() + "d");
                }
            }
        });

        Button e = findViewById(R.id.button2);
        e.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("E");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "E");
                } else {
                    textView.setText(textView.getText() + "e");
                }
            }
        });

        Button f = findViewById(R.id.button3);
        f.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("F");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "F");
                } else {
                    textView.setText(textView.getText() + "f");
                }
            }
        });

        Button g = findViewById(R.id.button4);
        g.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("G");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "G");
                } else {
                    textView.setText(textView.getText() + "G");
                }
            }
        });
    }

}
