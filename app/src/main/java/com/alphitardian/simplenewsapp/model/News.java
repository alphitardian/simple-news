package com.alphitardian.simplenewsapp.model;

import android.widget.ImageView;

public class News {
    String articleTitle;
    String articleNews;

    public News(String articleTitle, String articleNews) {
        this.articleTitle = articleTitle;
        this.articleNews = articleNews;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleNews() {
        return articleNews;
    }

    public void setArticleNews(String articleNews) {
        this.articleNews = articleNews;
    }
}
