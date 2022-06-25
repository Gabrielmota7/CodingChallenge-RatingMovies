package com.ratingMovies.Api.authentication.modules.dto;

import lombok.Data;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Data
public class CreateUserRoleDTO {

    private UUID idUser;

    private List<UUID> idsRoles;


}
