package rest_assured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class RestAssuredPetstoreTest {
    public static final String BASE_URI = "https://petstore.swagger.io/#/pet/uploadFile";
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = BASE_URI;
    }

}
