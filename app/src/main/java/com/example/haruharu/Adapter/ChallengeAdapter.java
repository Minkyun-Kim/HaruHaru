package com.example.haruharu.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haruharu.R;
import com.example.haruharu.data.Challenge;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ViewHolder> {
    ArrayList<Challenge> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.challenge, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Challenge challenge = items.get(position);
        holder.setItem(challenge);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Challenge challenge){ items.add(challenge);}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView goal;
        TextView goalHour;
        TextView goalMinute;
        TextView hour;
        TextView minute;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            goal = itemView.findViewById(R.id.goal);
            goalHour = itemView.findViewById(R.id.goal_hour);
            goalMinute = itemView.findViewById(R.id.goal_minute);
            hour = itemView.findViewById(R.id.hour);
            minute = itemView.findViewById(R.id.minute);
        }

        public void setItem(Challenge challenge) {
            goal.setText(challenge.getGoal());
            goalHour.setText(challenge.getGoalHour());
            goalMinute.setText(challenge.getGoalMinute());
            hour.setText(challenge.getHour());
            minute.setText(challenge.getMinute());
        }
    }
}
