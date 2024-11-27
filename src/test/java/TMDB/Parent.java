package TMDB;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class Parent {

    RequestSpecification reqSpec;

    @BeforeClass
    public void Setup() {
        baseURI = "https://api.themoviedb.org/";

        reqSpec = new RequestSpecBuilder()
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhNWNmYzI1NmRhOTEwZmM2N2ZjZDQ4OWE5OTczZGVjNCIsIm5iZiI6MTczMTg5MDM3NS44MDgyNTYxLCJzdWIiOiI2NzNhOGEwNmQyODA0M2U5NzZlM2M3NmEiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.hyw22jtXNg4JAAhzsyKtdqsTUz_HSGobPnFzOVab7-0")
                .setContentType(ContentType.JSON)
                .build();
    }}














