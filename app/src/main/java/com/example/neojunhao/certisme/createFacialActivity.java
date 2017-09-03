package com.example.neojunhao.certisme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class createFacialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_facial);
    }

    public void createIris (View view)
    {
        Intent intent = new Intent(this, createIrisActivity.class);
        startActivity(intent);
    }
}
