package com.hishmat.deltahacks2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class defgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defg);

        Button defg = findViewById(R.id.button1);
        defg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDEFG();
            }
        });
        Button hijk = findViewById(R.id.button3);
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
        Intent intent = new Intent(this, /*hijkActivity*/defgButtons.class);
        startActivity(intent);
        finish();
    }

}
