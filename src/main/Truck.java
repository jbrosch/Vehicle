package main;

public class Truck extends Vehicle implements VehicleLocal {

	private int numAxels;

	public Truck(String name, String colour, double weight, Person owner, int numAxels) {
		super(name, colour, weight, owner);
		this.numAxels = numAxels;
	}

	public void transferOwnership(Person newOwner){
		setOwner(newOwner);
	}


}
