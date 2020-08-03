package com.example.haruharu.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            goal = itemView.findViewById(R.id.goal);
            goalHour = itemView.findViewById(R.id.goal_hour);
            goalMinute = itemView.findViewById(R.id.goal_minute);
            hour = itemView.findViewById(R.id.hour);
            minute = itemView.findViewById(R.id.minute);

            Button plus_10 = itemView.findViewById(R.id.plus_10);
            Button plus_30 = itemView.findViewById(R.id.plus_30);
            Button minus_10 = itemView.findViewById(R.id.minus_10);
            Button minus_30 = itemView.findViewById(R.id.minus_30);

            plus_10.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String cur_minute = minute.getText().toString();
                    if (Integer.parseInt(cur_minute) == 50) {
                        minute.setText("0");
                        String cur_hour = hour.getText().toString();
                        hour.setText(Integer.toString(Integer.parseInt(cur_hour)+1));
                        return;
                    }
                    cur_minute = Integer.toString((Integer.parseInt(cur_minute) + 10));
                    minute.setText(cur_minute);
                }
            });

            plus_30.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String cur_minute = minute.getText().toString();
                    int cur_int_minute = Integer.parseInt(cur_minute);
                    if (cur_int_minute >= 30) {
                        minute.setText(Integer.toString(cur_int_minute-30));
                        String cur_hour = hour.getText().toString();
                        hour.setText(Integer.toString(Integer.parseInt(cur_hour)+1));
                        return;
                    }

                    cur_minute = Integer.toString((Integer.parseInt(cur_minute) + 30));
                    minute.setText(cur_minute);
                }
            });
            minus_10.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String cur_minute = minute.getText().toString();
                    if (Integer.parseInt(cur_minute) == 0) {
                        if(Integer.parseInt(hour.getText().toString()) == 0)
                            return;
                        minute.setText("50");
                        int cur_int_hour = Integer.parseInt(hour.getText().toString());
                        if(cur_int_hour >= 1){
                            cur_int_hour -= 1;
                            hour.setText(Integer.toString(cur_int_hour));
                        }
                        return;
                    }

                    cur_minute = Integer.toString((Integer.parseInt(cur_minute) - 10));
                    minute.setText(cur_minute);
                }
            });

            minus_30.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String cur_minute = minute.getText().toString();
                    int cur_int_minute = Integer.parseInt(cur_minute);

                    if (cur_int_minute < 30) {
                        if (Integer.parseInt(hour.getText().toString()) == 0) {
                            minute.setText("0");
                            return;
                        }

                        cur_int_minute += 30;
                        minute.setText(Integer.toString(cur_int_minute));

                        int cur_int_hour = Integer.parseInt(hour.getText().toString());
                        cur_int_hour -= 1;
                        hour.setText(Integer.toString(cur_int_hour));

                        return;
                    }

                    cur_minute = Integer.toString((Integer.parseInt(cur_minute) - 30));
                    minute.setText(cur_minute);
                }
            });
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
