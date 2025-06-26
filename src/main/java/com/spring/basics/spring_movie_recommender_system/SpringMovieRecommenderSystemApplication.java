package com.spring.basics.spring_movie_recommender_system;

import com.spring.basics.spring_movie_recommender_system.recommender.CollaborativeFilter;
import com.spring.basics.spring_movie_recommender_system.recommender.ContentBasedFilter;
import com.spring.basics.spring_movie_recommender_system.recommender.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringMovieRecommenderSystemApplication.class, args);
		CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);

		System.out.println("Collaborative Filter 1: " + cf1);
		System.out.println("Collaborative Filter 2: " + cf2);
		System.out.println("Collaborative Filter 3: " + cf3);
	}

}
