package com.example.drfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class FishInformation extends AppCompatActivity {

    private Button recipe1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_information);

        getSupportActionBar().setTitle("魚類辨識");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initViews();
        setListeners();

        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(FishInformation.this, "加入收藏", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FishInformation.this, "取消收藏", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initViews() {
        recipe1 = (Button)findViewById(R.id.re3);
    }

    private void setListeners() {
        recipe1.setOnClickListener(goRecipe);
    }

    private View.OnClickListener goRecipe = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(FishInformation.this, Recipe.class);
            startActivity(intent);
        }
    };
}
