package com.example.cofeemachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    private Button btnSmall;
    private Button btnMedium;
    private Button btnLarge;
    private TextView Coast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Coast = (TextView) findViewById(R.id.tvCoast);

    }
    public void click (View view){
        String text1, copeik;
        text1="Стоимость вашего напитка: ";
        copeik = " коп";
        int coastdrink=getIntent().getIntExtra("coast",0);
       int totalCoast =  0;
        int cupCoast = 0 ;
        String DrinkName =getIntent().getStringExtra("drinkName");

        switch (view.getId()){
            case R.id.btnSmall:
                cupCoast+=25;

                break;
            case R.id.btnMedium:
                cupCoast+=50;
              //  Coast.setText(String.valueOf(text1+cupCoast+copeik));
                break;
            case R.id.btnLarge:
                cupCoast+=75;
               // Coast.setText(String.valueOf(text1+cupCoast+copeik));
                break;
        }
        totalCoast = coastdrink+cupCoast;
        Coast.setText(String.valueOf(text1+totalCoast+copeik+"\n"+DrinkName));

    }
}
