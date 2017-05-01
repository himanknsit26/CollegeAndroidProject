package com.example.himankrao.dillidarshan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by himankrao on 30/4/17.
 */

public class Restauarants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Alkauser", "Chanakyapuri, Central Delhi"));
        words.add(new Word("Bukhara", "Diplomatic Enclave, Central Delhi"));
        words.add(new Word("En - The Japanese Restaurant, Food & Multi Cuisine Delhi", "Mehrauli, "
                + "South Delhi"));
        words.add(new Word("Gali Paranthe Wali", "Chandni Chowk, North Delhi"));
        words.add(new Word("Indian Accent", "Friends Colony, South Delhi"));
        words.add(new Word("Lazeez Affaire", "ChanakyaPuri, Central Delhi"));
        words.add(new Word("Lodi - The Garden Restaurant", "Lodi Road, Central Delhi"));
        words.add(new Word("Neung Roi", "Mahipalpur, West Delhi"));
        words.add(new Word("Parikrama - The Revolving Restaurant", "Connaught Place, Central Delhi"));
        words.add(new Word("Satya Niketan", "Moti Bagh, South Delhi"));
        words.add(new Word("Sevilla", "The Claridges, New Delhi,"));
        words.add(new Word("Taj Mahal Hotel, Delhi", "Mansingh Road, South Delhi"));
        words.add(new Word("Tamra Restaurant", "Connaught Place, Central Delhi"));
        words.add(new Word("The Spice Route", "Janpath, Central Delhi"));
        words.add(new Word("Zaffran", "Connaught Place, Central Delhi"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }

}
