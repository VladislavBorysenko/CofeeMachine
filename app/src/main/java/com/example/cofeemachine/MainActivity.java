package com.example.cofeemachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private ImageButton ibAmericano;
    private ImageButton ibCapucchino;
    private ImageButton ibEspresso;
    private ImageButton ibEspressoConPane;
    private ImageButton ibEspressomachiato;
    private ImageButton ibLatte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibAmericano = (ImageButton) findViewById(R.id.americano);
        ibCapucchino = (ImageButton) findViewById(R.id.capucchino);
        ibEspresso = (ImageButton) findViewById(R.id.espresso);
        ibEspressoConPane = (ImageButton) findViewById(R.id.espressoConPane);
        ibEspressomachiato = (ImageButton) findViewById(R.id.espressomachiato);
        ibLatte = (ImageButton) findViewById(R.id.latte);


    }

    public void onClick(View view) {
        int coastdrink = 0;
        String drinkName="";
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Bundle cost = new Bundle();

        switch (view.getId()) {
            case R.id.americano:
                coastdrink += 50;
                drinkName="americano";
              // cost.putString("Drink", "coast");
               //intent.putExtra("coast", coastdrink);
                break;


            case R.id.capucchino:
                //startActivity(intent);
                coastdrink += 75;
                drinkName="capucchino";
                break;


            case R.id.espresso:
              //  startActivity(intent);
                coastdrink += 25;
                break;


            case R.id.espressoConPane:
              //  startActivity(intent);
                coastdrink += 30;
                break;

            case R.id.espressomachiato:
             //   startActivity(intent);
                coastdrink += 35;
                break;


            case R.id.latte:
              //  startActivity(intent);
                coastdrink += 60;
                break;

        }
        intent.putExtra("coast", coastdrink);
        intent.putExtra("drinkName",drinkName );
        startActivity(intent);

    }
}

