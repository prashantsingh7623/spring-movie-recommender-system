package com.spring.basics.spring_movie_recommender_system.filter;

import org.springframework.stereotype.Component;

@Component
public interface Filter {
    String[] getRecommendations(String movieTitle);
}
