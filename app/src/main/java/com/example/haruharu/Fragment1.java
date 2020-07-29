package com.example.haruharu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haruharu.Adapter.OneDayAdapter;
import com.example.haruharu.data.OneDay;

public class Fragment1 extends Fragment {

    RecyclerView recyclerView;
    OneDayAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        initUI(rootView);

        return rootView;
    }

    public void initUI(ViewGroup rootView){


        recyclerView = rootView.findViewById(R.id.recyclerView1);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 5);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new OneDayAdapter();
        adapter.addItem(new OneDay("7/12", "fail_color", "1h 30m"));
        adapter.addItem(new OneDay("7/13", "fail_color", "1h 30m"));
        adapter.addItem(new OneDay("7/24", "pass_color", "1h 30m"));
        adapter.addItem(new OneDay("7/25", "fail_color", "1h 30m"));
        adapter.addItem(new OneDay("7/26", "pass_color", "1h 30m"));
        adapter.addItem(new OneDay("7/27", "pass_no_color", "1h 30m"));
        adapter.addItem(new OneDay("7/28", "pass_no_color", "1h 30m"));
        adapter.addItem(new OneDay("7/29", "pass_no_color", "1h 30m"));
        adapter.addItem(new OneDay("7/30", "pass_no_color", "1h 30m"));
        recyclerView.setAdapter(adapter);

    }
}
