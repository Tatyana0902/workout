package rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RestAssuredPetstoreTest {
    public static final String BASE_URI = "https://petstore.swagger.io/v2";

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    public void testAddNewPet() {
        JSONObject requestParams = new JSONObject().
                put("id", 0)
                .put("category", new JSONObject()
                        .put("id", 1)
                        .put("name", "Cat")
                ).put("name", "Kuza")
                .put("photoUrls", new JSONArray())
                .put("tags", new JSONArray())
                .put("status", "available");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post("/pet")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        assertNotNull(response.jsonPath().get("id"));
    }
    @Test
    public void testUploadAnImage(){
        Response response = given()
                .contentType("multipart/form-data")
                .multiPart("file", new File(this.getClass().getClassLoader().getResource("cat.jpg").getFile()))// Файл для загрузки
                .multiPart("MyName", "false") // Текстовое поле
                .header("Content-Type", "multipart/form-data")
                .when()
                .post("/pet/1/uploadImage")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void testUpdatePet(){
        JSONObject requestParams = new JSONObject().
                put("id", 0)
                .put("category", new JSONObject()
                        .put("id", 1)
                        .put("name", "Cat")
                ).put("name", "Luchik")
                .put("photoUrls", new JSONArray())
                .put("tags", new JSONArray())
                .put("status", "available");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .put("/pet")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        assertEquals("Luchik", response.jsonPath().get("name"));
    }
}


