package com.example.himankrao.dillidarshan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by himankrao on 1/5/17.
 */

public class PlacesNearDelhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Jaipur", "270 Km, Rajasthan"));
        words.add(new Word("Agra", "211 Km, Uttar Pradesh"));
        words.add(new Word("Mathura", "147 Km, Uttar Pradesh"));
        words.add(new Word("Chandigarh", "248 Km, Punjab"));
        words.add(new Word("Bharatpur", "182 Km, Rajasthan"));
        words.add(new Word("Haridwar & Rishikesh" , "210 Km, Uttarakhand"));
        words.add(new Word("Dehradun", "245 Km, Uttarakhand"));
        words.add(new Word("Shmila", "370 Km, Himachal Pradesh"));



        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
