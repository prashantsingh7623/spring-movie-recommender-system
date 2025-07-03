package com.spring.basics.spring_movie_recommender_system.recommender;

import com.spring.basics.spring_movie_recommender_system.filter.Filter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RecommenderImplementation {

    private final Filter filter;
    private Logger logger = LoggerFactory.getLogger(RecommenderImplementation.class);

    @Autowired
    public RecommenderImplementation(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("In RecommenderImplementation postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }

    /* method to recommend movie */
    public String[] recommendMovies(String movieTitle) {
        return filter.getRecommendations(movieTitle);
    }
}
