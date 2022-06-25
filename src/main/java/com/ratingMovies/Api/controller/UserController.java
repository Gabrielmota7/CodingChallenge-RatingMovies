package com.ratingMovies.Api.controller;

import com.ratingMovies.Api.authentication.modules.dto.CreateUserRoleDTO;
import com.ratingMovies.Api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ratingMovies.Api.repository.UserRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id) {

        Optional<User> userFind = this.userRepository.findById(id);

        if(userFind.isPresent()) {
            return userFind.get();
        }
        return null;
    }

    @PostMapping("/")
    public User user(@RequestBody User user){
        return this.userRepository.save(user);
    }

    @GetMapping("/list/{id}")
    public List<User> listMoreThan(@PathVariable("id") Long id) {
        return this.userRepository.findAllMoreThan(id);
    }

    @GetMapping("/findByName/{username}")
    public List<User> listMoreThan(@PathVariable("username") String username) {
        return this.userRepository.findByUsernameIgnoreCase(username);
    }



}
