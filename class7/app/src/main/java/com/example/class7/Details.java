package com.example.class7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle b = getIntent().getExtras();


        playstation1 p = (playstation1) b.getSerializable("game");
        ImageView Img = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.textView);
        TextView genre = findViewById(R.id.textView2);
        ImageView ano = findViewById(R.id.imageView3);
        TextView year = findViewById(R.id.textView1);

        Img.setImageResource(p.getImg());
        name.setText(p.getName());
        genre.setText(p.getGenre());
        year.setText(p.getYear()+" ");
        if(p.isChapters())
            ano.setImageResource(R.drawable.ic_baseline_check_24);
        else
            ano.setImageResource(R.drawable.ic_baseline_close_24);


    }

}



