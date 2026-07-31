package Com.Inheritance;

public class Car extends Vehicle {
	public void speed() {
		System.out.println("\nCar is moving at 80 km/h");
	}

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run();
		car.speed();
		
	}

}
