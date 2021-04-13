package com.alphitardian.simplenewsapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alphitardian.simplenewsapp.R;
import com.alphitardian.simplenewsapp.model.News;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ListViewHolder>{

    private ArrayList<News> newsArrayList;

    public NewsAdapter(ArrayList<News> newsArrayList) {
        this.newsArrayList = newsArrayList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_headline, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        News news = newsArrayList.get(position);

        holder.txtTitle.setText(news.getArticleTitle());
        holder.txtNews.setText(news.getArticleNews());
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle, txtNews;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.article_title_text);
            txtNews = itemView.findViewById(R.id.article_news_text);
        }

    }
}
