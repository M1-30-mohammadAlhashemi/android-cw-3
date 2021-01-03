package com.example.class7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter {
    ArrayList<playstation1>mArray;
    Context context;

    public GameAdapter(ArrayList<playstation1> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie,parent,false);
        ViewHolder vh =new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).name.setText( mArray.get(position).getName());
        ((ViewHolder)holder).levelOfGame.setText( mArray.get(position).getLevelOfGame());
        ((ViewHolder)holder).img1.setImageResource( mArray.get(position).getImg());
        ((ViewHolder)holder).level.setText( mArray.get(position).getLevel()+"");
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,Details.class);
                i.putExtra("game",mArray.get(position));
                context.startActivity(i);
            }
        });


        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ((ViewHolder)holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Delete");
                builder.setMessage("Are you sure you want to delete" );
                builder.setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mArray.remove(position);
                        notifyDataSetChanged();

                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "not Deleted",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img1;
        public ImageView delete;
        public TextView name;
        public TextView level;
        public TextView levelOfGame;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img1 = view.findViewById(R.id.imageView);
            delete=view.findViewById(R.id.delete);
            name = view.findViewById(R.id.name);
            level = view.findViewById(R.id.textView5);
            levelOfGame = view.findViewById(R.id.textView3);


        }

    }
}

