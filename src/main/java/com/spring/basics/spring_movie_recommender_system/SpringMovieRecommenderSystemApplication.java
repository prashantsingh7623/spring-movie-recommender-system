package com.spring.basics.spring_movie_recommender_system;

import com.spring.basics.spring_movie_recommender_system.lesson9.DummyFilter;
import com.spring.basics.spring_movie_recommender_system.lesson9.Movie;
import com.spring.basics.spring_movie_recommender_system.recommender.ContentBasedFilter;
import com.spring.basics.spring_movie_recommender_system.recommender.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringMovieRecommenderSystemApplication.class, args);
		DummyFilter dummyFilter = (DummyFilter) appContext.getBean("dummyFilter");
		System.out.println("Dummy Filter bean with singleton scope");
		System.out.println(dummyFilter);

		Movie movie1 = dummyFilter.getMovie();
		Movie movie2 = dummyFilter.getMovie();
		Movie movie3 = dummyFilter.getMovie();

		System.out.println("Movie bean with prototype scope!");
		System.out.println("Movie 1: " + movie1);
		System.out.println("Movie 2: " + movie2);
		System.out.println("Movie 3: " + movie3);

		System.out.println("DummyFilter instances created: " + DummyFilter.getDummyFilterInstances());
		System.out.println("Movie instances created: " + Movie.getMovieInstances());

	}

}
