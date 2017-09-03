package com.example.neojunhao.certisme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginFacialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facial);
    }

    public void loginIris (View view)
    {
        Intent intent = new Intent(this, loginIrisActivity.class);
        startActivity(intent);
    }

}
