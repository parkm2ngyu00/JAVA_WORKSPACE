import java.util.Scanner;

public class CircleArea {
	
	final static double PI = 3.141592;
	static double calculateCircleArea(double radius) {
		
		return radius * radius * PI;
	}

	public static void main(String[] args) {
	
		double radius = 5.0;
		double circleArea = 0;
		
		circleArea = calculateCircleArea(radius);
		System.out.println("radius : " + radius);
		System.out.printf("원의 면적 : %f\n", circleArea);
		// System.out.println(circleArea);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter radius : ");
		radius = scan.nextDouble();
		circleArea = calculateCircleArea(radius);
		System.out.printf("원의 면적 : %f\n", circleArea);
		scan.close();
	}
	
}
