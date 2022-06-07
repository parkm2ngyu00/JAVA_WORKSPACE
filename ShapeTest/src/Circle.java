
public class Circle extends Square {

	public Circle(ShapeColor color, ShapeRect rect) {
		super(color, rect);
		type = shapeType.CIRCLE;
	}


	@Override
	public void area() {
		double radius = rect.getHeight() / 2;
		System.out.println("Circle Area = " + radius * radius * 3.14);

	}

	@Override
	public String toString() {
		return "Circle [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}

}
