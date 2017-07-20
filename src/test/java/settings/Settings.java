package settings;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;

/**
 * Created by yurii on 27.02.17.
 */
public class Settings
{
    public static String BASE_URL = "https://www.google.com.ua/";
}
