package UinAPITesting.UinAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PublicAPITesting {
	
	@Test
	public void userPostHappyPath() {
		Response response = RestAssured.get("https://gorest.co.in/public-api/users/123/posts");
		
		System.out.println(response.getBody().asString());
		
		Assert.assertEquals(response.statusCode(), 200);
		
		JsonPath jsonPath = response.jsonPath();
		
		int limit = jsonPath.getInt("meta.pagination.limit");
		
		Assert.assertEquals(jsonPath.getInt("meta.pagination.total"), 0);
		Assert.assertEquals(jsonPath.getInt("meta.pagination.page"), 1);
		Assert.assertEquals(jsonPath.getInt("meta.pagination.limit"), 20);
		Assert.assertTrue(limit<25);
	}
	
}
