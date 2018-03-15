package com.example.services;

import java.util.Arrays;
import java.util.List;

import com.example.domain.Feed;
import com.example.domain.NewsIndicator;

public class FeedService {

	public static Feed getNewsFeed(int k) {
		return getNewsFeedArray(k);
	}

	private static Feed getNewsFeedArray(int k) {
		    
			Feed feed = new Feed();
			feed.setId(k);
			feed.setName("feedNames:".concat(String.valueOf(k)));
			feed.setNewsIndicators(getNewsIndicatorArray(k));
			
		
		return feed;
	}

	private static List<NewsIndicator> getNewsIndicatorArray(int k) {
		return Arrays.asList(
				  new NewsIndicator("good news 1" +k)
				, new NewsIndicator("good news 2"+k));
	}
}
