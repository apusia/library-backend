package com.library122022.getway.helper;

import com.github.javafaker.Faker;
import com.library122022.getway.controller.BookForm;
import org.junit.jupiter.api.Test;


public class ToJsonUT {

    @Test
    public void toJsonCheck(){
        String bookTitle = new Faker().book().title();
        BookForm bookForm = new BookForm(bookTitle);
        String bookFormAsJson = bookForm.toJson();
        bookFormAsJson.toString();
    }

}
