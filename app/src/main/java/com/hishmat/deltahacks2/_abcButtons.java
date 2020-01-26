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
//                MainActivity.inputText.setText(MainActivity.inputText.getText() + " Space");
                TextView textView = findViewById(R.id.inputText);
                if (textView.getText().equals("input")) {
                    textView.setText(" Space");
                } else {
                    textView.setText(textView.getText() + " Space");
                }
            }
        });

    }

}
