package com.alphitardian.simplenewsapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.alphitardian.simplenewsapp.R;
import com.alphitardian.simplenewsapp.adapter.NewsAdapter;
import com.alphitardian.simplenewsapp.data.DataSource;
import com.alphitardian.simplenewsapp.model.News;

import java.util.ArrayList;

public class HeadlineFragment extends ListFragment {

    private RecyclerView newsRV;
    private ArrayList<News> list = new ArrayList<>();
    DataSource source = new DataSource();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_headline, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        newsRV = view.findViewById(R.id.recycler_view);
        newsRV.setHasFixedSize(true);

        source.initData();
        list.addAll(source.loadData());

        newsRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        NewsAdapter adapter = new NewsAdapter(list);
        newsRV.setAdapter(adapter);
    }
}