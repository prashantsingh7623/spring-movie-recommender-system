package com.spring.basics.spring_movie_recommender_system;

import com.spring.basics.spring_movie_recommender_system.recommender.ContentBasedFilter;
import com.spring.basics.spring_movie_recommender_system.recommender.RecommenderImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringMovieRecommenderSystemApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringMovieRecommenderSystemApplication.class);
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringMovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        logger.info("Recommender implementation: {}", recommender.getClass().getName());
	}

}
