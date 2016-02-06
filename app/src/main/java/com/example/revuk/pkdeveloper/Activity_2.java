package com.example.revuk.pkdeveloper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity_2 extends AppCompatActivity {

    TextView textView;

    String key = "HARRY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = (TextView) findViewById(R.id.textView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/acd55.ttf");
        textView.setTypeface(typeface);

    }


    public void onClick(View v){
        Button but = (Button) findViewById(v.getId());
        textView.append(but.getText());
        Check();
    }

    public void Check(){
        String d = String.valueOf(textView.getText());
         if(key.equals(d) ) {
             Intent intent = new Intent(this, Activity_3.class);
             startActivity(intent);
         }

    }

}
