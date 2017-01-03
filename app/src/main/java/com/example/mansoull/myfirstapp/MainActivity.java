package com.example.mansoull.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button masuk;
    EditText usrnm, psswrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrnm = (EditText) findViewById(R.id.usrnm);
        psswrd = (EditText) findViewById(R.id.psswrd);
        masuk = (Button) findViewById(R.id.masuk);

        masuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ((v.getId())) {
            case R.id.masuk:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }

    }
}

