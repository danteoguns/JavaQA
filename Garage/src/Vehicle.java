import java.util.Scanner;

public abstract class Vehicle{

    private static int regNo;
    private static String name;
    private static String type;
    private static String model;

    public Vehicle (int regNo, String name, String type, String model) {
    	Vehicle.regNo = regNo;
    	Vehicle.name = name;
    	Vehicle.type = type;
    	Vehicle.model = model;
    }

    public static int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        Vehicle.regNo = regNo;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Vehicle.name = name;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        Vehicle.type = type;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        Vehicle.model = model;
    }

    public static void main (String[] args){
        Scanner motor = new Scanner(System.in);

        System.out.print("Enter RegNo: ");
        int regNo = motor.nextInt();

        System.out.print("Enter Name: ");
        String name = motor.next();

        System.out.print("Enter Type: ");
        String type = motor.next();
    }
    
//    @Override
//    public String toString() {
//    	return "Vehicle()";
//    	}
}
