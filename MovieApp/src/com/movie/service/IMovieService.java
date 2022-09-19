package com.movie.service;

import java.util.List;

import com.movie.servicecom.movie.exceptions.IdNotFoundException;
import com.movie.servicecom.movie.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

public interface IMovieService {
	List<Movie> getAll();

	List<Movie> getByLanguage(String language) throws MovieNotFoundException;

	List<Movie> getByGenre(String genre) throws MovieNotFoundException;

	Movie getById(int movieId) throws IdNotFoundException;

}
