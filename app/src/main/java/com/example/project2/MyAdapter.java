package com.example.project2;

import static androidx.recyclerview.widget.RecyclerView.*;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Viewholder> {

    private List<String> myDataset;

    public MyAdapter(List<String> mdata) {
        this.myDataset = mdata;

    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycleview, parent, false);
        ViewHolder viewHolder = new Viewholder(view);
        return (Viewholder) viewHolder;
        // return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.textView.setText(myDataset.get(position));

    }

//    @Override
//    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
//        holder.textView.setText(myDataset.get(position));
//
//    }


    @Override
    public int getItemCount() {
        return myDataset.size();

        // return 0;
    }


    public interface OnItemClickListener {
        void onCreate(Bundle savedInstanceState);

        void onItemClick(int adapterPosition);
    }

    // public MyAdapter(Object p0)
    public class Viewholder extends ViewHolder {
        TextView textView;
        public Viewholder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview);
        }

    }
}