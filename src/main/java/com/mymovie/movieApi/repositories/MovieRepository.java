package com.mymovie.movieApi.repositories;

import com.mymovie.movieApi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
