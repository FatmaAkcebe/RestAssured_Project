package TMDB;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class _01_AccountTest extends Parent {

    @Test
    public void GetAccountDetails() {

        given()
                .spec(reqSpec)
                .when()
                .get("3/account")
                .then()
                .statusCode(200)
                .log().body();
    }}


