package API;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Testing {

	
	@Test
	public void GetAllUser(){
		given()
		   .get("https://dummyjson.com/recipes")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	@Test
	public void GetUser(){
		given()
		   .get("https://dummyjson.com/recipes/3")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	
	@Test
	public void SearchRecipes() {
		given()
		 .get("https://dummyjson.com/recipes/search?q=South Indian Masala Dosa")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	
	@Test 
	public void Create(){
		JSONObject js = new JSONObject();
//         js.put("name", "Anil");
//        js.put("job", "leader");
         given()
         .contentType("application/json")
         .body(js.toJSONString())
         .when()
         .post("https://dummyjson.com/recipes/add")
         .then()
         .statusCode(200)
         .log()
         .all();
         
	}
	@Test
	public void putrequest(){
		JSONObject js = new JSONObject();
		js.put("name","Anil");
		js.put("job", "zion resident");
		given()
		   .contentType("application/json")
		   .body(js.toJSONString())
		   .when()
		   .put("https://dummyjson.com/recipes/34")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	
}
	
	@Test
	public void deletrequest() {
		JSONObject js = new JSONObject();
		given()
		   .when()
		   .delete("https://dummyjson.com/recipes/1")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
}

