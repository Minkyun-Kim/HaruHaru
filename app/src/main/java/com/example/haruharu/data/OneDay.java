package com.example.haruharu.data;

import android.widget.ImageView;
import android.widget.TextView;

public class OneDay {
    String date;
    String sticker;
    String totalTime;

    public OneDay(String date, String sticker, String totalTime) {
        this.date = date;
        this.sticker = sticker;
        this.totalTime = totalTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }
}

