package hello;

import org.testng.Assert;

import org.testng.annotations.Test;

public class CustomerTests {
	
	Customer customer = new Customer();

	@Test
	public void testCustomer() {
		
		customer.setFirstName("John");
		customer.setLastName("Smith");
		String name = customer.generateName();
		Assert.assertNotNull(name);
		Assert.assertEquals(name, "Name is: John Smith");
	}
	
	
}
