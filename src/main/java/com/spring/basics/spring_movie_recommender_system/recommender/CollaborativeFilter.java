package com.spring.basics.spring_movie_recommender_system.recommender;

import com.spring.basics.spring_movie_recommender_system.filter.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CF")
public class CollaborativeFilter implements Filter {

    @Override
    public String[] getRecommendations(String movieTitle) {
        return new String[] {"Collaborative Filter"};
    }
}
