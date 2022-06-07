
public class Car {
	private String color;
	private int speed;
	private int gear;
	
	public static int count = 0;
	// constructor
	public Car(String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		count++;
	}
	
	// default constructor
	public Car() {
		this("Red", 100, 3);
	}

	// getter & setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	// speedUp & speedDown
	public void speedup() {
		this.speed += 10;
	}
	
	public void speedDown() {
		this.speed -= 10;
	}

	// toString
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
}
