package TMDB;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class _05_MoviesTest extends Parent {

    int movieId=1104844;

    @Test
    public void Details() {

                given()
                        .spec(reqSpec)
                        .pathParam("movieId", movieId)
                        .when()
                        .get("3/movie/{movieId}")
                        .then()
                        .statusCode(200)
                        .log().body();

    }


    @Test
    public void lists() {

        given()
                .spec(reqSpec)
                .pathParam("movieId", movieId)
                .when()
                .get("3/movie/{movieId}/lists")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void addRating() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("value", "8.5");

        given()
                .spec(reqSpec)
                .body(requestBody)
                .pathParam("movieId", movieId)
                .when()
                .post("/3/movie/{movieId}/rating")
                .then()
                .log().body()
                .statusCode(201);

    }

    @Test(dependsOnMethods = "addRating")
    public void favoriteMovies() {

        given()
                .spec(reqSpec)
                .pathParam("movieId", movieId)
                .when()
                .delete("/3/movie/{movieId}/rating")
                .then()
                .log().body()
                .statusCode(200);

    }



}
