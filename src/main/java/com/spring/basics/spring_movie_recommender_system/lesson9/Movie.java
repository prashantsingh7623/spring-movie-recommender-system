package com.spring.basics.spring_movie_recommender_system.lesson9;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {

    public static int movieInstances = 0;

    public Movie() {
        movieInstances++;
        System.out.println("Movie constructor called!");
    }

    public static int getMovieInstances() {
        return movieInstances;
    }

}
