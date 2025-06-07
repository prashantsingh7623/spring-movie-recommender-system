package com.spring.basics.spring_movie_recommender_system.filter;

public interface Filter {
    public String[] getRecommendations(String movieTitle);
}
