
public class Circle extends Square {
	public double radius;
	public Circle(ShapeColor color, ShapeRect rect) {
		super(color, rect);
		type = ShapeType.CIRCLE;
		radius = rect.getWidth() / 2.0;
	}

	@Override
	public void area() {
		System.out.println(type + "Area = "
				+ radius * radius * Math.PI);
	}

	@Override
	public void perimeter() {
		System.out.println(type + "Perimeter = "
				+ 2 * radius * Math.PI);
	}
	
	@Override
	public String toString() {
		return "Circle [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}
	
}
