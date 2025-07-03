package com.spring.basics.spring_movie_recommender_system.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class DummyFilter {
    private static int dummyFilterInstances = 0;
    private final Movie movie;

    @Autowired
    public DummyFilter(Movie movie) {
        this.movie = movie;
        dummyFilterInstances++;
    }

//    @Lookup
    public Movie getMovie() {
        return movie;
    }

    public static int getDummyFilterInstances() {
        return dummyFilterInstances;
    }
}
