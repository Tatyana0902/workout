package com.smirnov.workout;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SimpleRestServiceApplicationTest {

    @Test
    public void testContextLoads() {
    }

    @Test
    public void testIsPrime() {
        Response response = get("/isPrime?n=17");
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals("true", response.asString());
    }
}