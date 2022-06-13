
public class Circle extends Square {
	
	public Circle(ShapeColor color, ShapeRect rect) {
		super(color, rect);
		type = ShapeType.CIRCLE;
	}

	@Override
	public String toString() {
		return "Circle [type=" + type + ", color=" + color + ", rect=" + rect + ", radius=" + rect.getWidth() / 2.0 + "]";
	}
	
	@Override
	public void area() {		
		double radius = rect.getWidth() / 2.0;
		System.out.println(type + " Area="
				+ radius * radius * Math.PI);
	}

	@Override
	public void perimeter() {
		double radius = rect.getWidth() / 2.0;
		System.out.println(type + " Perimeter="
				+ 2 * radius * Math.PI);
	}
}
