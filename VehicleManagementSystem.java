package core;

class Vehicle {
	String brand;
	String model;
	int year;

	void displayDetails(String b, String m, int y) {
		brand = b;
		model = m;
		year = y;
		System.out.println(" ");
	}
}

class Car extends Vehicle {
	int numberOfDoors;

	void displayDetails(String b, String m, int y) {
		brand = b;
		model = m;
		year = y;
		System.out.println("Brand is: " + b + "\nModel is: " + m + "\nYear of production: " + y);
	}
}

class Truck extends Vehicle {
	int payloadCapacity;

	void displayDetails(String b, String m, int y) {
		brand = b;
		model = m;
		year = y;
		System.out.println("Brand is: " + b + "\nModel is: " + m + "\nYear of production: " + y);
	}
}

public class VehicleManagementSystem {

	public static void main(String[] args) {
		Car c = new Car();
		Truck t = new Truck();
		c.numberOfDoors = 4;
		t.payloadCapacity = 45000;
		c.displayDetails("Kia", "2004", 2025);
		t.displayDetails("Suzuki", "2006", 2004);
	}

}
