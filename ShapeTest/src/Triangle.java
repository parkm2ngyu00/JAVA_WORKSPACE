
public class Triangle extends Shape {

	public Triangle(ShapeColor color, ShapeRect rect) {
		super(shapeType.TRIANGLE, color, rect);

	}

	@Override
	public void area() {
		System.out.println("Triangle Area = " + rect.getWidth() * rect.getHeight() / 2);

	}

	@Override
	public String toString() {
		return "Triangle [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}

}
