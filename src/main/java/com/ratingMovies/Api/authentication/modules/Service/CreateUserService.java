package com.ratingMovies.Api.authentication.modules.Service;

import com.ratingMovies.Api.models.User;
import com.ratingMovies.Api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreateUserService {

    @Autowired
    UserRepository userRepository;

    public User execute(User user) {


        User existsUser = (User) userRepository.findByUsername(user.getUsername());

        if(existsUser != null) {
            throw new Error("User already exists!");
        }
        User createdUser = userRepository.save(user);

        return createdUser;
    }
}
