package com.example.songpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton contestButton;
    ImageButton chargeButton;
    ImageButton pointButton;
    ImageButton reservButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contestButton = (ImageButton) findViewById(R.id.contestButton);
        chargeButton = (ImageButton) findViewById(R.id.chargeButton);
        pointButton = (ImageButton) findViewById(R.id.pointButton);
        reservButton = (ImageButton) findViewById(R.id.reservButton);



        contestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contestIntent = new Intent(getApplicationContext(), ContestActivity.class);
                startActivity(contestIntent);
            }
        });

        chargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
