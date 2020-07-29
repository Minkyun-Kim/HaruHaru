package com.example.haruharu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haruharu.Adapter.ChallengeAdapter;
import com.example.haruharu.data.Challenge;

public class Fragment2 extends Fragment {
    RecyclerView recyclerView;
    ChallengeAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment2, container, false);

        initUI(rootView);

        return rootView;
    }

    public void initUI(ViewGroup rootView){

        recyclerView = rootView.findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = (LinearLayoutManager) new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ChallengeAdapter();
        adapter.addItem(new Challenge("책 읽기", "1", "0", "0", "0"));
        adapter.addItem(new Challenge("안드로이드 공부", "2", "0", "0", "0"));
        adapter.addItem(new Challenge("운동", "1", "0", "0", "0"));
        adapter.addItem(new Challenge("알고리즘 문제 풀기", "1", "0", "0", "0"));

        recyclerView.setAdapter(adapter);




    }
}
