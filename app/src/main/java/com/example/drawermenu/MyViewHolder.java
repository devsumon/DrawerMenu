package com.example.drawermenu;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView numberoframadanText, sehriTimeText, quantText, numberText, topSehriText, topIftarText;
    ImageView flagimage;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        numberoframadanText = (TextView)itemView.findViewById(R.id.numberoframadanID);
        sehriTimeText =(TextView)itemView.findViewById(R.id.sehritimeId);
        flagimage =(ImageView)itemView.findViewById(R.id.flag);
        quantText =(TextView)itemView.findViewById(R.id.numberId);
        numberText =(TextView)itemView.findViewById(R.id.sehriId);
        topSehriText=(TextView)itemView.findViewById(R.id.firstsehritimeid);
        topIftarText=(TextView)itemView.findViewById(R.id.firstiftartimeid);


    }
}
