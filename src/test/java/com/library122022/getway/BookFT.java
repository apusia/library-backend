package com.library122022.getway;

import com.github.javafaker.Faker;
import com.library122022.getway.controller.BookForm;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookFT {

    private static final String PATH = "/books";

    @LocalServerPort
    private int serverPort;

    @Test
    public void createBook() {
        String bookTitle = new Faker().book().title();
        BookForm bookForm = new BookForm(bookTitle);

        final String endpointPost = "http://localhost:" + serverPort + PATH;

//        Response response =
        RestAssured.given()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(bookForm.toJson())
                .when()
                .post(endpointPost)
                .then()
                .assertThat()
                .statusCode(200);

//        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void readAllBooks() {
        final String endpointGet = "http://localhost:" + serverPort + PATH;

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .get(endpointGet);

        Assertions.assertEquals(200, response.statusCode());
        response.asString();
    }
}
