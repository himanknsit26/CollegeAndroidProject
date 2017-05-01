package com.example.himankrao.dillidarshan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by himankrao on 1/5/17.
 */

public class EmergencyNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("100 || 1090", "Police Helpline"));
        words.add(new Word("101", "Fire Helpline"));
        words.add(new Word("102", "Ambulance"));
        words.add(new Word("1099", "Accident & Trauma Centre"));
        words.add(new Word("1091", "Women's Helpline"));
        words.add(new Word("155370 || (011)22561231" , "Delhi Metro Helpline"));
        words.add(new Word("(011)26588500", "AIIMS Hospital"));
        words.add(new Word("(011)22152431", "ISBT Bus Helpline"));



        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
