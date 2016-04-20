package com.fokk.vforvector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CrossProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_product);
    }

    public void cross_product_function(View view) {

        // for vector A
        EditText editText = (EditText) findViewById(R.id.cross_edit_vectorA);
        String numbers = editText.getText().toString();

        String[] tokens = numbers.split(" ");
        int[] ary = new int[tokens.length];

        int i = 0;
        for (String token : tokens){
            ary[i++] = Integer.parseInt(token);
        }


        // for vector B
        EditText editText2 = (EditText) findViewById(R.id.cross_edit_vectorB);
        String numbers2 = editText2.getText().toString();

        String[] tokens2 = numbers2.split(" ");
        int[] ary2 = new int[tokens2.length];

        i = 0;
        for (String token : tokens2){
            ary2[i++] = Integer.parseInt(token);
        }

        // add now
        int ABi = ary[1] * ary2[2] - ary2[1] * ary[2];
        int ABj = ary2[0] * ary[2] - ary[0] * ary2[2];
        int ABk = ary[0] * ary2[1] - ary2[0] * ary[1];

        // print result
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(ABi);
        sb.append("i ");
        if(ABj >= 0) sb.append("+ ");
        sb.append(ABj);
        sb.append("j ");
        if(ABk >= 0) sb.append("+ ");
        sb.append(ABk);
        sb.append("k");
        String s = sb.toString();
        TextView textView = (TextView) findViewById(R.id.cross_text_result);
        textView.setText(s);

    }

}
