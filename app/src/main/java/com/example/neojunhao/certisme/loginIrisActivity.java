package com.example.neojunhao.certisme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginIrisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_iris);
    }


    public void mainMenu (View view)
    {
        Intent intent = new Intent(this, mainMenuActivity.class);
        startActivity(intent);
    }


}
