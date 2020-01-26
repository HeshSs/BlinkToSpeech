package com.hishmat.deltahacks2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (inputText == null) {
            inputText = findViewById(R.id.inputText);
        }

        Button type = findViewById(R.id.button1);
        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openType();
            }
        });
        Button commands = findViewById(R.id.button2);
        commands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCommands();
            }
        });
    }

    public void openType() {
        Intent intent = new Intent(this, TypeActivity.class);
        startActivity(intent);

        onStop();
        onRestart();
    }

    public void openCommands() {
        Intent intent = new Intent(this, CommandsActivity.class);
        startActivity(intent);

        onStop();
        onRestart();
    }

}
