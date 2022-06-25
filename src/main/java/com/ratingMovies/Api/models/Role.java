package com.ratingMovies.Api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    public Role(UUID id) {
        this.id = id;
    }
}
