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

public class defgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg);

        TextView inputText = findViewById(R.id._abcText);
        inputText.setText(MainActivity.inputText.getText());

        Button d = findViewById(R.id.buttonD);
        d.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = MainActivity.inputText;
                if (textView.getText().equals("input")) {
                    textView.setText("D");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "D");
                } else {
                    textView.setText(textView.getText() + "d");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

        Button e = findViewById(R.id.buttonE);
        e.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = MainActivity.inputText;
                if (textView.getText().equals("input")) {
                    textView.setText("E");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "E");
                } else {
                    textView.setText(textView.getText() + "e");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

        Button f = findViewById(R.id.buttonF);
        f.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = MainActivity.inputText;
                if (textView.getText().equals("input")) {
                    textView.setText("F");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "F");
                } else {
                    textView.setText(textView.getText() + "f");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

        Button g = findViewById(R.id.buttonG);
        g.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView textView = MainActivity.inputText;
                if (textView.getText().equals("input")) {
                    textView.setText("G");
                } else if (textView.getText().charAt(textView.getText().length()-1) == ' ') {
                    textView.setText(textView.getText() + "G");
                } else {
                    textView.setText(textView.getText() + "g");
                }
                MainActivity.inputText.setText(textView.getText());
                finish();
            }
        });

    }

}
