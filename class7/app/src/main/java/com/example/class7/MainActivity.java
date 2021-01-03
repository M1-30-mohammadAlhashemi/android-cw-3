package com.example.class7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<playstation1> play= new ArrayList<>();


        playstation1 a = new playstation1("Tekken 1",7,"Hard"," fighting video game",1994,R.drawable.tekken1,true);
        playstation1 h= new playstation1("mickey's wild adventure ",18,"nice game"," Video Game",1994,R.drawable.micymose,false);
        playstation1 b = new playstation1("Tekken 2",18,"Hard"," fighting video game",1995,R.drawable.tekken2,true);
        playstation1 c= new playstation1("Go Pikachu and Let’s Go Eevee",9,"Hard"," action role-playing video game ",1998,R.drawable.pokenon,true);
        playstation1 d = new playstation1("Sonic Adventure",3,"midem"," Adventure ",1998,R.drawable.sonic,false);
        playstation1 i= new playstation1("Pepci man",21,"nice game"," Video Game",1999,R.drawable.pepsiman,false);
        playstation1 k = new playstation1("Pac Man",15,"easy"," Video Game",1999,R.drawable.pacman,false);
        playstation1 e = new playstation1("The Lion King: Simba′s Mighty Adventure",7,"midem"," Video Game",2000,R.drawable.lionking,false);
        playstation1 g = new playstation1("Crash Bandicoot",15,"easy"," Video Game",2000,R.drawable.krash2,true);
        playstation1 l = new playstation1("Super Mario Bros.",0,"Very Hard"," Video Game",1986,R.drawable.supermario,true);
        play.add(l);
        play.add(a);
        play.add(h);
        play.add(b);
        play.add(c);
        play.add(d);
        play.add(i);
        play.add(e);
        play.add(g);
        play.add(k);


       RecyclerView gamelist=findViewById(R.id.rv);
       gamelist.setHasFixedSize(true);
       RecyclerView.LayoutManager lm =new LinearLayoutManager(this);
       gamelist.setLayoutManager(lm);
       GameAdapter Gm =new GameAdapter( play,MainActivity.this);
       gamelist.setAdapter(Gm);

       GameAdapter GmP =new GameAdapter(play,MainActivity.this);
       gamelist.setAdapter(GmP);


    }
}