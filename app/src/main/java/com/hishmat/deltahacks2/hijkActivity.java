package com.hishmat.deltahacks2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hijkActivity extends AppCompatActivity {
    public static TextView textView = MainActivity.inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg_buttons);

        TextView inputText = findViewById(R.id.typeText);
        inputText.setText(MainActivity.inputText.getText());

        Button hijk = findViewById(R.id.buttonHIJK);
        hijk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHIJK();
            }
        });
        Button lmno = findViewById(R.id.buttonLMNO);
        lmno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLMNO();
            }
        });
    }
    public void openHIJK() {
        Intent intent = new Intent(this, hijkButtons.class);
        startActivity(intent);
        finish();
    }

    public void gotoLMNO() {
        Intent intent = new Intent(this, /*lmnoActivity*/hijkButtons.class);
        startActivity(intent);
        finish();
    }

}
