package rest_assured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class RestApiTest {

    private static final String BASE_URI = "https://jsonplaceholder.typicode.com"; // Пример API

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    public void testGetPosts() {
        Response response = given()
                .when()
                .get("/posts")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        assertNotNull(response.jsonPath().getList("id"));
    }

    @Test
    public void testGetPostById() {
        Response response = given()
                .when()
                .get("/posts/1")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        assertEquals(1, (int) response.jsonPath().get("id"));
    }

    @Test
    public void testCreatePost() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("title", "Test Post");
        requestParams.put("body", "This is a test post body");
        requestParams.put("userId", 1);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post("/posts")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .response();

        assertNotNull(response.jsonPath().get("id"));
    }

    @Test
    public void testUpdatePost() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("id", 1);
        requestParams.put("title", "Updated Title");
        requestParams.put("body", "Updated body content");
        requestParams.put("userId", 1);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .put("/posts/1")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        assertEquals("Updated Title", response.jsonPath().get("title"));
    }

    @Test
    public void testDeletePost() {
        Response response = given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(200) // Или 204, в зависимости от API
                .extract()
                .response();

        // Дополнительные проверки, если это необходимо
        // В данном API delete возвращает пустой объект {}
    }
}


