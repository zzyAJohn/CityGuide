package com.example.cityguide.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cityguide.R;

import java.util.ArrayList;

public class MostViewAdapter extends RecyclerView.Adapter<MostViewAdapter.MostViewHolder> {

    ArrayList<MostViewHelperClass> mostViewLocations;

    public MostViewAdapter(ArrayList<MostViewHelperClass> mostViewLocations) {
        this.mostViewLocations = mostViewLocations;
    }

    @NonNull
    @Override
    public MostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design, parent, false);
        MostViewHolder mostViewHolder = new MostViewHolder(view);
        return mostViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewHolder holder, int position) {

        MostViewHelperClass mostViewHelperClass = mostViewLocations.get(position);

        holder.image.setImageResource(mostViewHelperClass.getImage());
        holder.tiltle.setText(mostViewHelperClass.getTitle());
        holder.desc.setText(mostViewHelperClass.getDescription());

    }

    @Override
    public int getItemCount() {
        return mostViewLocations.size();
    }

    public static class MostViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView tiltle, desc;

        public MostViewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks
            image = itemView.findViewById(R.id.mv_image);
            tiltle = itemView.findViewById(R.id.mv_title);
            desc = itemView.findViewById(R.id.mv_desc);

        }
    }


}
