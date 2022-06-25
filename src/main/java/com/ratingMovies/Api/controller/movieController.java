package com.ratingMovies.Api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class movieController {

    @GetMapping("/")
    public String verificarFilme(){

        return "movies";
    }
}
