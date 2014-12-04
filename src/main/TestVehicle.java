package main;

import java.util.UUID;

public class TestVehicle implements VehicleLocal {

	
	@SuppressWarnings("unused")
	public static void main(String [ ] args)
	{
		Person personA = new Person("John","Doe",UUID.randomUUID());
		Car car = new Car("Ford","green",123.45, personA, 4);
		Truck truck1 = new Truck("Tahoe","blue",345.67, personA,2);
		Person personB = new Person("Jane","Dorn",UUID.randomUUID());
		MotorCylce cycle = new MotorCylce("Harley","orange",23.45,personA,false);
		truck1.transferOwnership(personB);
	}
	
}
