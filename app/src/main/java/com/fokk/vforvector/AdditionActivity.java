package com.fokk.vforvector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
    }

    public void add_function(View view) {

        // for vector A
        EditText editText = (EditText) findViewById(R.id.addition_edit_vectorA);
        String numbers = editText.getText().toString();

        String[] tokens = numbers.split(" ");
        int[] ary = new int[tokens.length];

        int i = 0;
        for (String token : tokens){
            ary[i++] = Integer.parseInt(token);
        }


        // for vector B
        EditText editText2 = (EditText) findViewById(R.id.addition_edit_vectorB);
        String numbers2 = editText2.getText().toString();

        String[] tokens2 = numbers2.split(" ");
        int[] ary2 = new int[tokens2.length];

        i = 0;
        for (String token : tokens2){
            ary2[i++] = Integer.parseInt(token);
        }

        // add now
        int[] ary_result = new int[tokens.length];
        i = 0;
        for (String token : tokens) {
            ary_result[i] = ary[i] + ary2[i];
            i++;
        }

        // print result
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(ary_result[0]);
        sb.append("i ");
        if(ary_result[1] >= 0) sb.append("+ ");
        sb.append(ary_result[1]);
        sb.append("j ");
        if(ary_result[2] >= 0) sb.append("+ ");
        sb.append(ary_result[2]);
        sb.append("k");
        String s = sb.toString();
        TextView textView = (TextView) findViewById(R.id.addition_text_result);
        textView.setText(s);

    }

}
