package hello;

import org.springframework.data.annotation.Id;


public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName()
    {
    	return firstName;
    }
    
    public String getLastName()
    {
    	return lastName;
    }

    public String getId() {
		return id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String generateName()
	{
		return "Name is: " + firstName + " " + lastName; 
	}

	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}