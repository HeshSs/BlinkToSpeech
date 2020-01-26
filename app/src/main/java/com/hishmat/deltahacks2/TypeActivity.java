package com.hishmat.deltahacks2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TypeActivity extends AppCompatActivity {
    public static TextView textView = MainActivity.getInputText();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        TextView inputText = findViewById(R.id.typeText);
        inputText.setText(MainActivity.inputText.getText());

        Button _abc = findViewById(R.id.button1);
        _abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_ABC();
            }
        });
        Button defg = findViewById(R.id.button3);
        defg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoDEFG();
            }
        });
    }
    public void open_ABC() {
        Intent intent = new Intent(this, _abcButtons.class);
        startActivity(intent);
        finish();
    }

    public void gotoDEFG() {
        Intent intent = new Intent(this, defgActivity.class);
        startActivity(intent);
        finish();
    }

}
