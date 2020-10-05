package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etText1;
    private EditText etText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.etText1 = findViewById(R.id.et_texto1);
        this.etText2 = findViewById(R.id.et_texto2);
    }
    @Override
    protected void onStart() { super.onStart(); }

    public void onClickbtnMostrar(View v) {
        Toast.makeText(MainActivity.this, etText1.getText() + " " + etText2.getText(), Toast.LENGTH_LONG).show();
    }

    public void onClickbtnLimpar(View v) {
        etText1.setText("");
        etText2.setText("");
    }


}