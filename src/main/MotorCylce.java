package main;

public class MotorCylce extends Vehicle implements VehicleLocal {

	private Boolean hasSideCar;
	
	public MotorCylce(String name, String colour, double weight, Person owner, Boolean hasSideCar) {
		super(name, colour, weight, owner);
		this.hasSideCar = hasSideCar;
	}

}
