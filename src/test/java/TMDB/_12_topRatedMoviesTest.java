package TMDB;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class _12_topRatedMoviesTest extends Parent {
    @Test
    public void topRatedMovies() {

        given()
                .spec(reqSpec)

                .when()
                .get(" 3/movie/popular")

                .then()
                .log().body()
                .statusCode(200);


    }
}
