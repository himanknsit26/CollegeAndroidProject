package com.example.himankrao.dillidarshan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by himankrao on 30/4/17.
 */

public class TouristSpots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Agrasen Ki Baoli", "K G Marg, Central Delhi", R.drawable.agrasen));
        words.add(new Word("Akshardham Temple", "Pandav Nagar, East Delhi", R.drawable.akshar));
        words.add(new Word("Chhatarpur Temple", "Chhatarpur, South-West Delhi", R.drawable.chatt));
        words.add(new Word("Garden of Five Senses", " Mehrauli-Badarpur Road, South Delhi", R.drawable.garden5senses));
        words.add(new Word("Gurudwara Bangla Sahib", "Connaught Place, Central Delhi", R.drawable.bangla));
        words.add(new Word("Humayun's Tomb", "Mathura Road, South Delhi", R.drawable.humayu));
        words.add(new Word("India Gate", "Rajpath Marg, Central Delhi", R.drawable.download));
        words.add(new Word("Jama Masjid", "Chandni Chowk, North Delhi", R.drawable.jama));
        words.add(new Word("Jantar Mantar", "Connaught Place, Central Delhi", R.drawable.jantar));
        words.add(new Word("Lotus Temple", "Kalkaji, South Delhi", R.drawable.lotus));
        words.add(new Word("National Science Centre", "Pragati Maidan, Central Delhi", R.drawable.sciencemuseum));
        words.add(new Word("Purana Quila", "Pragati Maidan, Central Delhi", R.drawable.purana));
        words.add(new Word("Qutub Minar", "Mehrauli, South Delhi", R.drawable.qutub));
        words.add(new Word("Rashtrapati Bhavan", "Presidents Estate, Central Delhi", R.drawable.rashtrapati));
        words.add(new Word("Red Fort", "Chandni Chowk, North Delhi", R.drawable.redfort));



        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
