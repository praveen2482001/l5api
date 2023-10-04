//package ApitestPage;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.hasItems;
//import static org.hamcrest.Matchers.equalTo;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import net.serenitybdd.junit.runners.SerenityRunner;
//
//@RunWith(SerenityRunner.class)
//public class Listall {
//	@Test
//	public void Listdetails() {
//		given()
//		.when()
//		 .get("http://localhost:8080/employees/list")
//		.then()
//		.body("name",hasItems("praveen","karthi"))
//		.statusCode(200)
//		.header("Content-Type","application/json")
//		.log().all();
//	}
//}
