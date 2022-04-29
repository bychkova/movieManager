package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    Movie[] MoviesList = new Movie[0];
    int MoviesLimit = 10;

    public MovieManager(int moviesLimit){
        MoviesLimit = moviesLimit;
    }

    public MovieManager(){

    }

    public void AddMovie(Movie movie){
        Movie[] newMoviesList = new Movie[MoviesList.length + 1];
        for(int i = 0; i < MoviesList.length; i++){
            newMoviesList[i] = MoviesList[i];
        }
        newMoviesList[newMoviesList.length - 1] = movie;
        MoviesList = newMoviesList;
    }

    public void FindAll(){
        for (int i = 0; i < MoviesList.length; i++){
            System.out.println("Название: " + MoviesList[i].Name + ". Жанр: " + MoviesList[i].Genre);
        }
    }

    public void FindLast(){
        int result;
        if(MoviesList.length > MoviesLimit){
            result = MoviesLimit;
        } else {
            result = MoviesList.length;
        }
        for(int i = 0; i < result - 1; i++){
            System.out.println("Название: " + MoviesList[MoviesList.length - i - 1].Name + ". Жанр: " + MoviesList[MoviesList.length -i - 1].Genre);
        }
    }

}
