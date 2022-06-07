
public class CarTest {

	public static void main(String[] args) {
		// create an instance
		Car car = new Car();
		car.setColor("Blue");
		car.setSpeed(60);
		car.setGear(3);
		System.out.println(car);
		car.speedup();
		System.out.println(car);
		System.out.println("car count=" + Car.count);
		
		System.out.println("\ncarArray");
		/*
		Car[] carArray = new Car[3];
		carArray[0] = new Car("Red", 10, 3);
		carArray[1] = new Car("Blue", 20, 3);
		carArray[2] = new Car("Green", 30, 3);
		*/
		Car[] carArray = {new Car("Red", 10, 3), new Car("Blue", 20, 3), new Car("Green", 30, 3)};
		for (Car c : carArray) {
			System.out.println(c);
		}
		System.out.println("car count=" + Car.count);
	}
}
