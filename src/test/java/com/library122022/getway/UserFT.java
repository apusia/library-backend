package com.library122022.getway;

import com.github.javafaker.Faker;
import com.library122022.getway.controller.UserForm;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserFT {
    private static final String PATH = "/user";

    @LocalServerPort
    private int serverPort;


    @Test
    public void addUser() {

        String userName = new Faker().name().firstName();
        String userSurname = new Faker().name().lastName();

        UserForm userForm = new UserForm(userName, userSurname);

        final String endpointPostUser = "http://localhost:" + serverPort + PATH;

        RestAssured.given()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(userForm.toJson())
                .when()
                .post(endpointPostUser)
                .then()
                .assertThat()
                .statusCode(200);

    }
}
