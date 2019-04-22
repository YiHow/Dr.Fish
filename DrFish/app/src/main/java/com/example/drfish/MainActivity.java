package com.example.drfish;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setListeners();
    }

    private Button btn_search;
    private Button btn_identify;
    private Button btn_favorite;
    private Button btn_recipe;
    private Button btn_account;

    private void initViews() {
        btn_search = (Button)findViewById(R.id.btnSear);
        btn_identify = (Button)findViewById(R.id.btnIden);
        btn_favorite = (Button)findViewById(R.id.btnFavorite);
        btn_recipe = (Button)findViewById(R.id.btnRecipe);
        btn_account = (Button)findViewById(R.id.btnAccount);
    }

    private void setListeners() {
        btn_identify.setOnClickListener(idenFish);
        btn_favorite.setOnClickListener(myFavorite);
        btn_recipe.setOnClickListener(shareRecipe);
        btn_account.setOnClickListener(myAccount);
    }

    private View.OnClickListener idenFish = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, IdentifyFish.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener myFavorite = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Favorite.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener shareRecipe = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ShareRecipe.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener myAccount = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Account.class);
            startActivity(intent);
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            openOptionsDialog();
        }

        return super.onOptionsItemSelected(item);
    }
    private void openOptionsDialog()
    {
        new AlertDialog.Builder(this)
                .setTitle("Dr.Fish")
                .setMessage("魚類辨識及食譜交流")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                .show();
    }
}
