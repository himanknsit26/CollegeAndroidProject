package com.example.himankrao.dillidarshan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by himankrao on 30/4/17.
 */

public class Main_2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_2);



        TextView tSpot = (TextView) findViewById(R.id.tspots);



        tSpot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent spots = new Intent(Main_2.this, TouristSpots.class);

                // Start the new activity
                startActivity(spots);
            }
        });


        TextView resto = (TextView) findViewById(R.id.resto);



        resto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Restaurants}
                Intent restos = new Intent(Main_2.this, Restauarants.class);

                // Start the new activity
                startActivity(restos);
            }
        });


        TextView shop = (TextView) findViewById(R.id.shop);



        shop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Restaurants}
                Intent shop = new Intent(Main_2.this, ShoppingAttractions.class);

                // Start the new activity
                startActivity(shop);
            }
        });


        TextView placesNear = (TextView) findViewById(R.id.nearbyPlaces);



        placesNear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Restaurants}
                Intent nearPlaces = new Intent(Main_2.this, PlacesNearDelhi.class);

                // Start the new activity
                startActivity(nearPlaces);
            }
        });

        TextView emergency = (TextView) findViewById(R.id.emergencyNo);



        emergency.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Restaurants}
                Intent numberEmergency = new Intent(Main_2.this, EmergencyNumbers.class);

                // Start the new activity
                startActivity(numberEmergency);
            }
        });

    }

}
