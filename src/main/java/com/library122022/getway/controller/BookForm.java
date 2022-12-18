package com.library122022.getway.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.library122022.getway.helper.ToJson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Value
public class BookForm implements ToJson {
    @JsonProperty("new_title")
    private String title;

}
