package TMDB;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class _10_playingMoviesTest extends Parent {
    @Test
    public void playingMoviesTest() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/movie/popular")
                .then()
                .statusCode(200);

    }}

