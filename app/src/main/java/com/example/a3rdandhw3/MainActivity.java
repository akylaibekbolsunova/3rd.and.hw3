package com.example.a3rdandhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        button.setOnClickListener(v -> {
            if (editText.getText().toString() != "") {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + editText.getText()));
                startActivity(intent);
            }
        });
    }

    public void init() {
        editText = findViewById(R.id.editT);
        button = findViewById(R.id.btn);
    }
}