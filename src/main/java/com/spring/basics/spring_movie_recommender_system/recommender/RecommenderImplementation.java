package com.spring.basics.spring_movie_recommender_system.recommender;

import com.spring.basics.spring_movie_recommender_system.filter.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    @Qualifier("CF")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /* method to recommend movie */
    public String[] recommendMovies(String movieTitle) {
        return filter.getRecommendations(movieTitle);
    }
}
