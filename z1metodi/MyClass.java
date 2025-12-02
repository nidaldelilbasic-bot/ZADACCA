package z1metodi;

public class MyClass {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		v1.color = "blue";
		v1.maxSpeed = 280;
		v1.wheels = 4;
		v1.fuelCapacity = 240.5;
		v2.maxSpeed = 320;
		v2.wheels = 6;
		v2.color = "green";
		v2.fuelCapacity = 500;
		v2.horn();
	}
}

