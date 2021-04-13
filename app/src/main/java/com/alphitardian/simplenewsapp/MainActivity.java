package com.alphitardian.simplenewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.alphitardian.simplenewsapp.data.DataSource;
import com.alphitardian.simplenewsapp.fragments.HeadlineFragment;
import com.alphitardian.simplenewsapp.model.News;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentManager fragmentManager = getSupportFragmentManager();
        HeadlineFragment headlineFragment = new HeadlineFragment();
        Fragment fragment = fragmentManager.findFragmentByTag(HeadlineFragment.class.getSimpleName());

        if (!(fragment instanceof  HeadlineFragment)) {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container, headlineFragment, HeadlineFragment.class.getSimpleName())
                    .commit();
        }
    }
}