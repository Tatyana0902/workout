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
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
        classes = SimpleRestServiceApplication.class)
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

    @Test
    public void testIsPrimeMinusOne() {
        Response response = get("/isPrime?n=-1");
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatusCode());
        assertEquals("n < 0", response.asString());
    }
    @Test
    public void testIsPrimeNull() {
        Response response = get("/isPrime?n=0");
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals("false", response.asString());
    }
    @Test
    public void testIsPrimeThree() {
        Response response = get("/isPrime?n=3");
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals("true", response.asString());
    }

    @Test
    public void testIsPrimeEleven() {
        Response response = get("/isPrime?n=11");
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals("true", response.asString());
    }
}