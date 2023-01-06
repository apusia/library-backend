package com.library122022.getway.controller;

import com.library122022.getway.helper.ToJson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.security.SecureRandom;


@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class UserForm implements ToJson {

    private final String name;
    private final String surname;


}

