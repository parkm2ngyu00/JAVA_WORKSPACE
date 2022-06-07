
public class Rectangle extends Shape {

	public Rectangle(ShapeColor color, ShapeRect rect) {
		super(shapeType.RECTANGLE, color, rect);
		
	}

	@Override
	public void area() {
		System.out.println("Rectangle Area = " + rect.getWidth() * rect.getHeight());
	}

	@Override
	public String toString() {
		return "Rectangle [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}

}
