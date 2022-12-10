package com.library122022.getway.controller;

import com.library122022.getway.helper.ToJson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Value
public class BookForm implements ToJson {
    private String title;

}
