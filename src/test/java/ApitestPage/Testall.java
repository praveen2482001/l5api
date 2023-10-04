package ApitestPage;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class Testall {
	@Test()
	public void Listdetails() {
		given()
		.when()
		 .get("http://localhost:8082/employees/list")
		.then()
		.statusCode(200)
		.header("Content-Type","application/json")
		.log().all();
	}
	@Test
	public void getUsingName() {
		given()
		.when()
		 .get("http://localhost:8082/employees/list1?name=praveen")
		.then()
		.statusCode(200)
		.assertThat().body("name", equalTo("praveen"))
		.header("Content-Type","application/json");
	}
	public static HashMap map=new HashMap<>();
	@BeforeClass
	public static void postData() {
		map.put("name","prakash");
		map.put("email","prakash@gmail.com");
		map.put("role_id",1);
		map.put("status",1);
		RestAssured.baseURI="http://localhost:8082/employees/save";
	}
	@Test
	public void testPost() {
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(200);
		
	}
}
