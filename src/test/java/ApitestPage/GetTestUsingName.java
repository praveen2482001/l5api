//package ApitestPage;
//
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.en.Given;
//import net.serenitybdd.annotations.Managed;
//import net.serenitybdd.annotations.Steps;
//import net.serenitybdd.annotations.Title;
//import net.serenitybdd.junit.runners.SerenityRunner;
//
//@RunWith(SerenityRunner.class)
//public class GetTestUsingName{
//	@Test
//	public void getUsingName() {
//		given()
//		.when()
//		 .get("http://localhost:8080/employees/list1?name=praveen")
//		.then()
//		.statusCode(200)
//		.assertThat().body("name", equalTo("praveen"))
//		.header("Content-Type","application/json");
//	}
//    }
//
//    
//
//
