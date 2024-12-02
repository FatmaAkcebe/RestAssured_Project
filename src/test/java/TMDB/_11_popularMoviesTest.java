package TMDB;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class _11_popularMoviesTest extends Parent{
    @Test
    public void PopularMovies() {


        given()
                .spec(reqSpec)

                .when()
                .get("3/movie/top_rated")

                .then()
                .log().body()
                .statusCode(200)
        ;

    }
}


