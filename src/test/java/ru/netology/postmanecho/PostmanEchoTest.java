package ru.netology.postmanecho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldResponseEcho() {
        String text = "winter";
        given()
                .baseUri("https://postman-echo.com")
                .body("winter")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("winter"))
        ;
    }
}