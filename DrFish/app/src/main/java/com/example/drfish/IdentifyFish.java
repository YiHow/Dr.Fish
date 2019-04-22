package com.example.drfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IdentifyFish extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_fish);

        getSupportActionBar().setTitle("拍照辨識");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initViews();
        setListeners();
    }

    private Button identify;

    private void initViews() {
        identify = (Button)findViewById(R.id.identify);
    }

    private void setListeners() {
        identify.setOnClickListener(whatFish);
    }

    private View.OnClickListener whatFish = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(IdentifyFish.this, FishInformation.class);
            startActivity(intent);
        }
    };

}
