package main;

public class Car extends Vehicle implements VehicleLocal {

	private int numDoors;
	
	public Car(String name, String colour, double weight, Person owner, int numDoors) {
		super(name, colour, weight, owner);
		this.numDoors = numDoors;
	}

}
