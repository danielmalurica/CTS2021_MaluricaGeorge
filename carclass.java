
public class carclass {

		public boolean motor;
		private int cylinders;
		private String name;
		private int roti;
	
	
	public int getcylinders() {
		return cylinders;
	}

	public void setcylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public carclass(int cylinder, String name) {
		this.cylinders=cylinder;
		this.name=name;
		this.motor=true;
		this.roti=4;
	}
	
	public String startengine() {
		return "The car's engine is starting";
	}
	
	public String accelerate() {
		return "The car is accelerating";
	}
	
	public String brake() {
		return "The car is braking";
	}
	
	
	
}
