package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;


public class IntegrationTests {
	
	//@Autowired
	//public CustomerRepository repository;
	
	@Test
	public void testStatus() {
		
		Response response = RestAssured.get("http://localhost:8090/helloWorld");
		int code = response.getStatusCode();
		String line = response.getStatusLine();
		Assert.assertEquals(code, 200);
		
		System.out.println(code + line);
		
		
	}
	
	/*@Test
	public void testRepository() {
		
		Customer customer = new Customer("New", "Guy");
		repository.save(customer);


		Customer result = new Customer();
		result = repository.findByFirstName("New");
		System.out.println(result);
		Assert.assertEquals(result,customer);
		
		
		
	}*/

	
}
