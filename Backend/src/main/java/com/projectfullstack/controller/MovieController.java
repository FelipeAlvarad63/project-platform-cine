package com.projectfullstack.controller;


import com.projectfullstack.entities.Movie;
import com.projectfullstack.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173") // Ajustar si uso otro puerto con Vue
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Movie guardar(@RequestBody Movie Movie) {
        return service.guardar(Movie);
    }

    @GetMapping("/{id}")
    public Movie obtener(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Movie actualizar(@PathVariable Long id, @RequestBody Movie Movie) {
        Movie.setId(id);
        return service.guardar(Movie);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}