
public class Triangle extends Shape {
	private double hypotenuse;
	
	public Triangle(ShapeColor color, ShapeRect rect) {
		super(ShapeType.TRIANGLE, color, rect);
	}

	// right-angled triangle
	// hypotenuse = sqrt(base^2 + height^2)
	private static double hypotenuse(double width, double height) {
		return Math.sqrt(width * width + height* height);
	}
	
	@Override
	public String toString() {
		return "Triangle [type=" + type + ", color=" + color + ", rect=" + rect +
				", hypotenuse=" + hypotenuse(rect.getWidth(), rect.getHeight()) + "]";
	}

	@Override
	public void area() {
		System.out.println(type + " Area="
				+ rect.getWidth() * rect.getHeight() / 2.0);
	}

	@Override
	public void perimeter() {
		System.out.println(type + " Perimeter="
				+ (rect.getWidth() + rect.getHeight() + hypotenuse(rect.getWidth(), rect.getHeight())));
	}
}