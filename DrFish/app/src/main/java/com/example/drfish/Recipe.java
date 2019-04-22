package com.example.drfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Recipe extends AppCompatActivity {

    private RecyclerView ingreList;
    private MyAdapter adapter;
    private ArrayList<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        getSupportActionBar().setTitle("食譜交流");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // 準備資料，塞50個項目到ArrayList裡
        for(int i = 0; i < 5; i++) {
            mData.add("食材"+i);
        }

        // 連結元件
        ingreList = (RecyclerView) findViewById(R.id.ingreList);
        // 設置RecyclerView為列表型態
        ingreList.setLayoutManager(new LinearLayoutManager(this));
        // 設置格線
        ingreList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        // 將資料交給adapter
        adapter = new MyAdapter(mData);
        // 設置adapter給recycler_view
        ingreList.setAdapter(adapter);
    }
}
