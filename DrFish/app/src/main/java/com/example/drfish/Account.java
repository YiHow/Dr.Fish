package com.example.drfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Account extends AppCompatActivity {

    private RecyclerView myRecipes;
    private MyAdapter adapter;
    private ArrayList<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        getSupportActionBar().setTitle("帳號資訊");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // 準備資料，塞50個項目到ArrayList裡
        for(int i = 0; i < 10; i++) {
            mData.add("我的食譜"+i);
        }

        // 連結元件
        myRecipes = (RecyclerView) findViewById(R.id.myRecipes);
        // 設置RecyclerView為列表型態
        myRecipes.setLayoutManager(new LinearLayoutManager(this));
        // 設置格線
        myRecipes.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        // 將資料交給adapter
        adapter = new MyAdapter(mData);
        // 設置adapter給recycler_view
        myRecipes.setAdapter(adapter);
    }
}
