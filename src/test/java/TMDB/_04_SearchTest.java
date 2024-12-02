package TMDB;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class _04_SearchTest extends Parent {

    @Test
    public void movie() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/search/movie?query=movie")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void Tv() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/search/movie?query=tv")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void person() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/search/person?query=person")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void Keyword() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/search/keyword?query=name")
                .then()
                .statusCode(200)
                .log().body();
    }
}