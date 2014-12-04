package main;

import java.util.UUID;

public class Person {
	
	private String firstName;
	private String lastName;
	private UUID personID;
	
	public Person(String firstName, String lastName, UUID personID){
		this.firstName = firstName;
		this.lastName = lastName;
		this.personID = personID;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setPersonID(){
		this.personID = UUID.randomUUID();
	}
	
	public UUID getPersonID(){
		return personID;
	}
	
}
