package com.spring.basics.spring_movie_recommender_system.recommender;

import com.spring.basics.spring_movie_recommender_system.filter.Filter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(ContentBasedFilter.class);

    @PostConstruct
    public void postConstruct() {
        logger.info("Content based filter post construct");
    }

    public ContentBasedFilter() {
        logger.info("Content based filter constructor");
    }

    @PreDestroy
    private void preDestroy() {
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }

    @Override
    public String[] getRecommendations(String movieTitle) {
        return new String[] {"Content based recommender"};
    }
}
