package tests;

import io.restassured.http.Method;
import lesson_16.AssuredConfig;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostEchoTest extends AssuredConfig {
    @Test
    void postMethod() {
        given()
                .cookie("Cookie", getCookie())
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .expect()
                .when()
                .post(getBaseUrl() + "post")
                .then()
                .spec(getResponseSpecification());

    }

}
