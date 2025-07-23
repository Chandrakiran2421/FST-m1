package Activities;

public class car {
	String color;
	String transformation;
	int make;
	int tyres;
	int doors;
	
	
	car(){
		tyres=4;
		doors=4;
	}
	public void displaycharactristics() {
	System.out.println("Color of the car is:"+color);
	System.out.println("Transformation of the car is:"+transformation);
	System.out.println("Making year of the car is:"+make);
	System.out.println("number of tyres in car :"+tyres);
	System.out.println("number of doors in car :"+doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving");
	}
	public void brake() {
		System.out.println("Car got stopped");
	}
}

