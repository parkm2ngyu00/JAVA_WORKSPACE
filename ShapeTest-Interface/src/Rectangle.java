
public class Rectangle extends Shape {

	public Rectangle(ShapeColor color, ShapeRect rect) {
		super(ShapeType.RECTANGLE, color, rect);
	}

	@Override
	public String toString() {
		return "Rectangle [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}
	
	@Override
	public void area() {
		System.out.println(type + "Area ="
				+ rect.getWidth() * rect.getHeight());
	}
	
	@Override
	public void perimeter() {
		System.out.println(type + "Perimeter ="
				+ 2 * (rect.getWidth() + rect.getHeight()));
	}

}
