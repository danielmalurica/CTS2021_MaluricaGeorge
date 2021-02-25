
public class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int numberOfWheels;
	
	
	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Car(int cylinder, String name) {
		this.cylinders=cylinder;
		this.name=name;
		this.engine=true;
		this.numberOfWheels=4;
	}
	
	public String startEngine() {
		return "The car's engine is starting";
	}
	
	public String accelerate() {
		return "The car is accelerating";
	}
	
	public String brake() {
		return "The car is braking";
	}
	
	
	
}
