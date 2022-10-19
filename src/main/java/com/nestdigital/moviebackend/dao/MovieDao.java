package com.nestdigital.moviebackend.dao;

import com.nestdigital.moviebackend.model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
