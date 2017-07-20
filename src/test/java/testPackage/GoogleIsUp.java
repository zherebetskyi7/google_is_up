package testPackage;

import org.testng.annotations.Test;
import settings.Settings;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;
import static settings.Settings.BASE_URL;

/**
 * Created by yurii on 27.02.17.
 */
public class GoogleIsUp
{
    @Test
    public void makeSureThatGoogleIsUp()
    {
        given()
                .baseUri(BASE_URL)
        .when()
            .get(BASE_URL)
        .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Google"));
    }

}
