package com.spring.basics.spring_movie_recommender_system.recommender;

import com.spring.basics.spring_movie_recommender_system.filter.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movieTitle) {
        return new String[] {"Content based recommender"};
    }
}
