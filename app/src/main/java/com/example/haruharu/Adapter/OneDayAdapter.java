package com.example.haruharu.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haruharu.R;
import com.example.haruharu.data.OneDay;

import java.util.ArrayList;

public class OneDayAdapter extends RecyclerView.Adapter<OneDayAdapter.ViewHolder>{
    ArrayList<OneDay> items = new ArrayList<>();

    @NonNull
    @Override
    public OneDayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.one_day, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OneDayAdapter.ViewHolder viewHolder, int position) {
        OneDay oneDay = items.get(position);
        viewHolder.setItem(oneDay);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(OneDay oneDay) {
        items.add(oneDay);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView date;
        ImageView sticker;
        TextView totalTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.date);
            sticker = itemView.findViewById(R.id.sticker);
            totalTime = itemView.findViewById(R.id.totalTime);
        }

        public void setItem(OneDay oneDay) {
            date.setText(oneDay.getDate());

            if(oneDay.getSticker().equals("fail_color")){
                sticker.setImageResource(R.drawable.fail_color);
            }
            else if(oneDay.getSticker().equals("pass_no_color")){
                sticker.setImageResource(R.drawable.pass_no_color);
            }
            else if(oneDay.getSticker().equals("pass_color")){
                sticker.setImageResource(R.drawable.pass_color);
            }
            else if(oneDay.getSticker().equals("fail_no_color")){
                sticker.setImageResource(R.drawable.fail_no_color);
            }

            totalTime.setText(oneDay.getTotalTime());
        }
    }
}
