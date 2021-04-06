package com.lusy.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnHomeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHomeActivity = (Button)findViewById(R.id.btn_home_activity);
        btnHomeActivity.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_home_activity:
                Intent moveIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}

