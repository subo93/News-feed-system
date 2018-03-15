package com.example.domain;

import java.util.List;

public class Feed {

	int id;
	String name;
	List<NewsIndicator> newsIndicators;

	public List<NewsIndicator> getNewsIndicators() {
		return newsIndicators;
	}

	public Feed(int id, String name, List<NewsIndicator> newsIndicators) {
		super();
		this.id = id;
		this.name = name;
		this.newsIndicators = newsIndicators;
	}

	public void setNewsIndicators(List<NewsIndicator> newsIndicators) {
		this.newsIndicators = newsIndicators;
	}

	public Feed() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
