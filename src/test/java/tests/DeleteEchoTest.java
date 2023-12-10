package tests;

import io.restassured.http.ContentType;
import lesson_16.AssuredConfig;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteEchoTest extends AssuredConfig {
    @Test
    void deleteMethod() {
        given()
                .cookie(getCookie())
                .contentType(ContentType.TEXT)
                .body(getStrBody())
                .expect()
                .body("data", equalTo(getStrBody()))
                .when()
                .delete(getBaseUrl() + "delete")
                .then()
                .log().all()
                .spec(getResponseSpecification());
    }
}
