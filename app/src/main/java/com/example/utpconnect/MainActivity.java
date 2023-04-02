package com.example.utpconnect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ImageView greetImg;
    TextView greetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetImg = findViewById(R.id.greeting_img);
        greetText = findViewById(R.id.greeting_text);

        ImageView btn = findViewById(R.id.img_car);
        ImageView btnFood = findViewById(R.id.imageFood);
        ImageView btnMotor = findViewById(R.id.imageMotor);
        ImageView btnClothes = findViewById(R.id.imageClothing);
        ImageView btnDelivery = findViewById(R.id.imageDelivery);
        ImageView btnExp = findViewById(R.id.imageExp);
        ImageView btnHotel = findViewById(R.id.imageHotel);
        ImageView btnTicket = findViewById(R.id.imageTickets);
        ImageView btnTocken = findViewById(R.id.imageToken);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MapViewActivity.class));
            }
        });

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        btnTocken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Service", Toast.LENGTH_LONG).show();
            }
        });

        greeting();

    }

    @SuppressLint("SetTextI18n")
    private void greeting() {
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 0 && timeOfDay < 12){
            greetText.setText("GOOD MORNING!");
            greetImg.setImageResource(R.drawable.img_default_half_morning);
        } else if (timeOfDay >= 12 && timeOfDay < 15) {
            greetText.setText("GOOD AFTERNOON!");
            greetImg.setImageResource(R.drawable.img_default_half_afternoon);
        } else if (timeOfDay >= 15 && timeOfDay < 18) {
            greetText.setText("GOOD EVENING!");
            greetImg.setImageResource(R.drawable.img_default_half_without_sun);
        } else if (timeOfDay >= 18 && timeOfDay < 24) {
            greetText.setText("GOOD NIGHT!");
            greetText.setTextColor(Color.WHITE);
            greetImg.setImageResource(R.drawable.img_default_half_night);
        }
    }
}

