package com.library122022.getway.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.library122022.getway.helper.ToJson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.security.SecureRandom;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserForm implements ToJson {

@JsonProperty("new_user")
    private String name;
    private String surname;


}

