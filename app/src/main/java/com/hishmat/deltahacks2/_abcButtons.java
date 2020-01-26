package com.hishmat.deltahacks2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class _abcButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__abc_buttons);


        Button space = findViewById(R.id.button1);
        space.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText(" ");
                } else {
                    textView.setText(textView.getText() + " ");
                }
            }
        });

        Button a = findViewById(R.id.button2);
        a.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("A");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "A");
                } else {
                    textView.setText(textView.getText() + "a");
                }
            }
        });

        Button b = findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("B");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "B");
                } else {
                    textView.setText(textView.getText() + "b");
                }
            }
        });

        Button c = findViewById(R.id.button4);
        c.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText("C");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "C");
                } else {
                    textView.setText(textView.getText() + "c");
                }
            }
        });
    }

}
