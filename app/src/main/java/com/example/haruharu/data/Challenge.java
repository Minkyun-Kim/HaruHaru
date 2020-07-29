package com.example.haruharu.data;

public class Challenge {
    String goal;
    String goalHour;
    String goalMinute;
    String hour;
    String minute;

    public Challenge(String goal, String goal_hour_time, String goal_minute_time, String hour, String minute) {
        this.goal = goal;
        this.goalHour = goal_hour_time;
        this.goalMinute = goal_minute_time;
        this.hour = hour;
        this.minute = minute;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getGoalHour() {
        return goalHour;
    }

    public void setGoalHour(String goalHour) {
        this.goalHour = goalHour;
    }

    public String getGoalMinute() {
        return goalMinute;
    }

    public void setGoalMinute(String goalMinute) {
        this.goalMinute = goalMinute;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}
