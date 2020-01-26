package com.hishmat.deltahacks2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

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

    }

}
