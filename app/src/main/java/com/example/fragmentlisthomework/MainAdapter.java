package com.example.fragmentlisthomework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> data = new ArrayList<>();
   ViewClickListener listener;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_main,parent,false);
        MainViewHolder holder = new MainViewHolder(v);
        holder.listener = listener;
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
        holder.result = holder.textView.getText().toString();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
