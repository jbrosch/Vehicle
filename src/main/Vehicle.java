package main;

public abstract class Vehicle implements VehicleLocal {

	private String name;
	private String colour;
	private double weight;
	private Person owner;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String name, String colour, double weight, Person owner){
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.setOwner(owner);
	}
	
	public void transferOwnership(Person newOwner){
		
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}


}
