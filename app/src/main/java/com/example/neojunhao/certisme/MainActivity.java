package com.example.neojunhao.certisme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createAccount (View view)
    {
        Intent intent = new Intent(this, createAccountActivity.class);
        startActivity(intent);
    }

    public void loginAccount (View view)
    {
        Intent intent = new Intent(this, loginAccountActivity.class);
        startActivity(intent);
    }

}
