package TMDB;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class _01_AccountTest extends Parent {

    int accountId=0;

    @Test
    public void GetAccountDetails() {

        accountId=
        given()
                .spec(reqSpec)
                .when()
                .get("3/account")
                .then()
                .statusCode(200)
                .log().body()
                .extract().path("id");

        System.out.println("Account ID: " + accountId);
    }


    @Test
    public void addFavorite() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("media_type", "movie");
        requestBody.put("media_id", 550);
        requestBody.put("favorite", true);


        given()
                .spec(reqSpec)
                .body(requestBody)
                .pathParam("accountId", accountId)
                .when()
                .post("/3/account/{accountId}/favorite")
                .then()
                .log().body()
                .statusCode(201);

    }

    @Test
    public void addToWatchlis() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("media_type", "movie");
        requestBody.put("media_id", 11);
        requestBody.put("watchlist", true);


        given()
                .spec(reqSpec)
                .body(requestBody)
                .pathParam("accountId", accountId)
                .when()
                .post("/3/account/{accountId}/watchlist")
                .then()
                .log().body()
                .statusCode(201);

    }

    @Test
    public void favoriteMovies() {

        given()
                .spec(reqSpec)
                .pathParam("accountId", accountId)
                .when()
                .get("/3/account/{accountId}/favorite/movies")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void favoriteTv() {

        given()
                .spec(reqSpec)
                .pathParam("accountId", accountId)
                .when()
                .get("/3/account/{accountId}/favorite/tv")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void ratedMovies() {

        given()
                .spec(reqSpec)
                .pathParam("accountId", accountId)
                .when()
                .get("/3/account/{accountId}/rated/movies")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void ratedTv() {

        given()
                .spec(reqSpec)
                .pathParam("accountId", accountId)
                .when()
                .get("/3/account/{accountId}/rated/tv")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void wathlistMovies() {

        given()
                .spec(reqSpec)
                .pathParam("accountId", accountId)
                .when()
                .get("/3/account/{accountId}/watchlist/movies")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void wathlistTv() {

        given()
                .spec(reqSpec)
                .pathParam("accountId", accountId)
                .when()
                .get("/3/account/{accountId}/watchlist/tv")
                .then()
                .log().body()
                .statusCode(200);

    }



}


