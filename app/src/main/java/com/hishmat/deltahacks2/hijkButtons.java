package com.hishmat.deltahacks2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hijkButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg_buttons);


        Button h = findViewById(R.id.buttonH);
        h.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("H");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "H");
                } else {
                    textView.setText(textView.getText() + "h");
                }
            }
        });

        Button i = findViewById(R.id.buttonI);
        i.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("I");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "I");
                } else {
                    textView.setText(textView.getText() + "i");
                }
            }
        });

        Button j = findViewById(R.id.buttonJ);
        j.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("J");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "J");
                } else {
                    textView.setText(textView.getText() + "j");
                }
            }
        });

        Button k = findViewById(R.id.buttonK);
        k.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("K");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "K");
                } else {
                    textView.setText(textView.getText() + "k");
                }
            }
        });
    }

}
