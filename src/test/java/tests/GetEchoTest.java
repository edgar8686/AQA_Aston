package tests;

import lesson_16.AssuredConfig;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetEchoTest extends AssuredConfig {
    @Test
    void getMethod() {
        given()
                .cookie("Cookie", getCookie())
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .expect()
                .when()
                .get(getBaseUrl() + "get")
                .then()
                .spec(getResponseSpecification());

    }
}
