package TMDB;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class _02_GenresTest extends Parent {

    @Test
    public void MoveList() {

                given()
                        .spec(reqSpec)
                        .when()
                        .get("3/genre/movie/list")
                        .then()
                        .statusCode(200)
                        .log().body();
    }

    @Test
    public void TvList() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/genre/tv/list")
                .then()
                .statusCode(200)
                .log().body();
    }






















}
