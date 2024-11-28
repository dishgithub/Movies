package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Controller

public class MovieController {
    @Autowired
    MovieRepository repo;

    @GetMapping("find-all-movies")
    @ResponseBody
    public List<Movie> findAllMovies() {
        return repo.findAll();

    }

    @PostMapping("save-movie")
    @ResponseBody
    public Movie saveMovie(@RequestBody Movie m){
        System.out.println(m.getId());
        System.out.println(m.getTitle());
        System.out.println(m.getDirector());
        return repo.save(m);
    }

}
