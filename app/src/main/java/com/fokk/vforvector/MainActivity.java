package com.fokk.vforvector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View view) {
        Intent intent = new Intent(this, AdditionActivity.class);
        startActivity(intent);
    }

    public void subtraction(View view) {
        Intent intent = new Intent(this, SubtractionActivity.class);
        startActivity(intent);
    }

    public void cross_product(View view) {
        Intent intent = new Intent(this, CrossProductActivity.class);
        startActivity(intent);
    }

    public void trivia(View view) {
        Intent intent = new Intent(this, TriviaActivity.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void credits(View view) {
        Intent intent = new Intent(this, CreditsActivity.class);
        startActivity(intent);
    }

}
