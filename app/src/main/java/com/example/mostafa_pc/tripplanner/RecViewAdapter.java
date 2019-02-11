package com.example.mostafa_pc.tripplanner;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.RecViewHolder> {


    private String[] x;

    public RecViewAdapter(String[] x) {
        this.x = x;
    }

    public static class RecViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public RecViewHolder(TextView v1) {
            super(v1);
            this.tv = v1;
        }
    }

    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row, viewGroup, false);
        RecViewHolder rvh = new RecViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(RecViewHolder viewHolder, int i) {
        viewHolder.tv.setText(x[i]);
    }



    @Override
    public int getItemCount() {
        return 0;
    }
}
