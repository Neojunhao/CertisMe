package com.example.neojunhao.certisme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class createIrisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_iris);
    }

    public void accountCreated (View view)
    {
        Intent intent = new Intent(this, createCompleteActivity.class);
        startActivity(intent);
    }
}
