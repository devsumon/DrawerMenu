package com.example.drawermenu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

   ArrayList<String> RamadanCalendar;
   Context c;



    public MyAdapter(Context c, ArrayList<String> RamadanCalendar) {

        this.c=c;
        this.RamadanCalendar=RamadanCalendar;

    }
     ViewGroup parent;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {


//        View v;
//        if(viewType==0){
//            v = LayoutInflater.from(c).inflate(R.layout.topramadan, viewGroup, false);
//        } else{
//            v = LayoutInflater.from(c).inflate(R.layout.activity_ramadan, viewGroup, false);
//        }
//        MyViewHolder VH =new MyViewHolder(v);
//
//        return VH;



        View v= LayoutInflater.from(c).inflate(R.layout.activity_ramadan, parent, false);

        MyViewHolder VH =new MyViewHolder(v);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.numberoframadanText.setText(RamadanCalendar.get(i));

    }

    @Override
    public int getItemCount() {
        return RamadanCalendar.size();
    }
}
