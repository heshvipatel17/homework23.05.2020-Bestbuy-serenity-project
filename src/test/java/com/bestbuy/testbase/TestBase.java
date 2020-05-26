package com.bestbuy.testbase;

/* By Jitendra Patel */

import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt() {

        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        //writing Integer.parseInt as RestAssured.part method is of int type
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
    }
}