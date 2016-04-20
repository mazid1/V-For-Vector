package com.fokk.vforvector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
    }

    public void addition_theory(View view) {
        Intent intent = new Intent(this, AdditionTheoryActivity.class);
        startActivity(intent);
    }

    public void subtraction_theory(View view) {
        Intent intent = new Intent(this, SubtractionTheoryActivity.class);
        startActivity(intent);
    }

    public void cross_product_theory(View view) {
        Intent intent = new Intent(this, CrossProductTheoryActivity.class);
        startActivity(intent);
    }
}
