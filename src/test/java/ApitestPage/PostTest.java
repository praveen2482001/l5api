//package ApitestPage;
//
//import static io.restassured.RestAssured.given;
//
//import java.util.HashMap;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import io.cucumber.java.en.Given;
//import io.restassured.RestAssured;
//import net.serenitybdd.junit.runners.SerenityRunner;
//
//@RunWith(SerenityRunner.class)
//public class PostTest {
//	public static HashMap map=new HashMap<>();
//	@BeforeClass
//	
//	public static void postData() {
//		map.put("name","prakash");
//		map.put("email","prakash@gmail.com");
//		map.put("role_id",1);
//		map.put("status",1);
//		RestAssured.baseURI="http://localhost:8080/employees/save";
//	}
//	
//	@Test
//	
//	public void testPost() {
//		given()
//		.contentType("application/json")
//		.body(map)
//		.when()
//		.post()
//		.then()
//		.statusCode(200);
//		
//	}
//}
