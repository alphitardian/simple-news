package com.alphitardian.simplenewsapp.data;

import android.util.Log;

import com.alphitardian.simplenewsapp.model.News;

import java.util.ArrayList;

public class DataSource {

    ArrayList<News> dataset = new ArrayList<>();

    public void initData() {
        dataset.add(new News("Judul 1", "lalallala"));
        dataset.add(new News("Judul 2", "lililili"));
    }

    public Boolean addData(News data) {
        Log.d("ADD_DATA", "addData: " + data);
        dataset.add(data);
        return true;
    }

    public ArrayList loadData() {
        return dataset;
    }

}
