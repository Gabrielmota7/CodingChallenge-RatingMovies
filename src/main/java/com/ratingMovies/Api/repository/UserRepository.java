package com.ratingMovies.Api.repository;

import com.ratingMovies.Api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User,Long>{

    @Query("SELECT u from User u Where u.id > :id")
    public List<User> findAllMoreThan(@Param("id") Long id);


    public List<User> findByIdGreaterThan(Long id);

    public List<User> findByUsernameIgnoreCase(String username);

    public List<User> findByUsername(String username);


}
