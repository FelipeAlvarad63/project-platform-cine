package com.projectfullstack.service;

import com.projectfullstack.entities.Movie;
import com.projectfullstack.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repo;

    public List<Movie> listarTodas() {
        return repo.findAll();
    }

    public Movie guardar(Movie Movie) {
        return repo.save(Movie);
    }

    public Movie buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
