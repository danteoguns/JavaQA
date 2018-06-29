public class Car extends Vehicle {

	public Car(int regNo, String name, String type, String model) {
		super(regNo, name, type, model);
	}

	private int regNo;
	private int doors;
	private int seats;
	private int engineSize;

//	public void Car(int regNo, int doors, int seats, int engineSize) {
//		super (getRegNo(), getName(), getType(), getModel());
//	}
}
