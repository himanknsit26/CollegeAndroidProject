package com.example.himankrao.dillidarshan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by himankrao on 1/5/17.
 */

public class ShoppingAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Chandni Chowk Market", " Central Delhi"));
        words.add(new Word("Sarojini Nagar Market", "Sarojini Nagar, South Delhi"));
        words.add(new Word("Janpath", "Janpath, Central Delhi"));
        words.add(new Word("Connaught Place Market", " Central Delhi"));
        words.add(new Word("Delhi Haat", "INA, East Delhi"));
        words.add(new Word("DLF Emporio" , "Vasant Kunj, South Delhi"));
        words.add(new Word("Select City Walk", "Saket, South Delhi"));
        words.add(new Word("South Extension", "South Delhi"));
        words.add(new Word("Ambience Mall", "GuruGram, NCR Region"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

                listView.setAdapter(adapter);
    }

}
