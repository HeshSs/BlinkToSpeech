package com.hishmat.deltahacks2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class defgActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg);

        TextView inputText = findViewById(R.id.defgText);
        inputText.setText(MainActivity.inputText.getText());

        Button defg = findViewById(R.id.buttonOpenDEFG);
        defg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDEFG();
            }
        });
        Button hijk = findViewById(R.id.buttonGotoHIJK);
        hijk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHIJK();
            }
        });
    }

    public void openDEFG() {
        Intent intent = new Intent(this, defgButtons.class);
        startActivity(intent);
        finish();
    }

    public void gotoHIJK() {
        Intent intent = new Intent(this, hijkActivity.class);
        startActivity(intent);
        finish();
    }

}
