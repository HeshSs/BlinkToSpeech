package com.hishmat.deltahacks2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class defgAndHijk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg_and_hijk);

        TextView inputText = findViewById(R.id.typeText);
        inputText.setText(MainActivity.inputText.getText());

        Button _abc = findViewById(R.id.button_ABC);
        _abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DEFG();
            }
        });
        Button defg = findViewById(R.id.buttonGotoDEFG);
        defg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hijkAndLmnoActivity();
            }
        });
    }
    public void DEFG() {
        Intent intent = new Intent(this, defgActivity.class);
        startActivity(intent);
        finish();
    }

    public void hijkAndLmnoActivity() {
        Intent intent = new Intent(this, /*hijkAndLmnoActivity*/defgActivity.class);
        startActivity(intent);
        finish();
    }

}
