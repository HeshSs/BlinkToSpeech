package com.hishmat.deltahacks2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class _abcButtons extends AppCompatActivity {
    public static TextView textView = MainActivity.inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__abc_buttons);

        TextView inputText = findViewById(R.id._abcText);
        inputText.setText(MainActivity.inputText.getText());

        Button space = findViewById(R.id.buttonSpace);
        space.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("input")) {
                    textView.setText(" ");
                } else {
                    textView.setText(textView.getText() + " ");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

        Button a = findViewById(R.id.buttonA);
        a.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("input")) {
                    textView.setText("A");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "A");
                } else {
                    textView.setText(textView.getText() + "a");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

        Button b = findViewById(R.id.buttonB);
        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("input")) {
                    textView.setText("B");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "B");
                } else {
                    textView.setText(textView.getText() + "b");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

        Button c = findViewById(R.id.buttonC);
        c.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("input")) {
                    textView.setText("C");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "C");
                } else {
                    textView.setText(textView.getText() + "c");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });
    }

}
