package lesson_16;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AssuredConfig {
    static Properties prop = new Properties();
    private static InputStream configFile;
    private static String baseUrl;
    private static String cookie;
    private static String strBody;
    private static ResponseSpecification responseSpecification;
    private static RequestSpecification requestSpecification;

    @BeforeAll
    static void testing() throws IOException {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        configFile = new FileInputStream("src/main/resources/properties");
        prop.load(configFile);

        baseUrl = prop.getProperty("base_url");
        cookie = prop.getProperty("cookie");
        strBody = prop.getProperty("name");

        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectStatusLine("HTTP/1.1 200 OK")
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(3500L))
                .build();

    }


    public static String getBaseUrl() {
        return baseUrl;
    }

    public static ResponseSpecification getResponseSpecification() {
        return responseSpecification;
    }

    public static RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public static String getCookie() {
        return cookie;
    }

    public static String getStrBody() {
        return strBody;
    }
}
