package com.library122022.getway.controller;

import com.library122022.getway.configuration.JsonObjectMapper;
import com.library122022.getway.repository.UserEntity;
import com.library122022.getway.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.annotations.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")// dobrze? w sumie nie wiem gdzie kierowac chyba na konto uzytkownika

public class UserController {

    private final UserRepository repository;

    /*@GetMapping
    public List<UserEntity>   // w sumie po co mam odczytywac wszystkich użytkowników
*/

    @SneakyThrows
    @PostMapping(path = "")
    public UserEntity createUser(@RequestBody String userFormString) {
        UserForm userForm = JsonObjectMapper.jsonObjectMapper().readValue(userFormString, UserForm.class);

        UserEntity userEntity = UserEntity.builder()
                .name(userForm.getName())
                .surname(userForm.getSurname())
                .build();

        return repository.save(userEntity);
    }


}
