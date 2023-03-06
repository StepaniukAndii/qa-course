package resetAssured.requst;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public abstract class BaseRequest {


    public BaseRequest header(String name, String value) {
        RestAssured.requestSpecification.header(new Header(name, value));
        return this;
    }

    public Response post(Object o, String endPoint) {
        return given()
                .body(o)
                .when()
                .post(endPoint)
                .then()
                .extract().response();
    }
}
