import java.util.ArrayList;

public class Garage {

	static ArrayList<Vehicle> motor = new ArrayList<>();
	
//	int regNo, String name, String type, String model

    public static void main(String[] args) {
		Vehicle car1 = new Car (123, "BMW", "Car", "1 Series");
		Vehicle car2 = new Car (234, "Audi", "Car", "A5");
		Vehicle motorcycle1 = new Motorcycle (345, "BSA", "Motorcyle", "Thunderbolt");
		Vehicle motorcycle2 = new Motorcycle (456, "Velocette", "Motorcyle", "Venom");

		motor.add(car1);
		motor.add(car2);
		motor.add(motorcycle1);
		motor.add(motorcycle2);
	}
	
	public int charge() {
		for (int i = 0; i < motor.size(); i++) {
			if(Vehicle.getType().equals("Car")) {
				return 500;
			} else if (Vehicle.getType().equals("Motorcyle")) {
				return 300;
			} else {
				return 0;
			}
		} return 0;
	}
}