
public class Triangle extends Shape {

	private double hypotenuse;
	
	public Triangle(ShapeColor color, ShapeRect rect) {
		super(ShapeType.TRIANGLE, color, rect);
		hypotenuse = Math.sqrt(rect.getWidth() * rect.getWidth() + rect.getHeight() * rect.getHeight());
	}

	@Override
	public String toString() {
		return "Triangle [type=" + type + ", color=" + color + ", rect=" + rect + "hypotenuse=" + hypotenuse + "]";
	}
	
	@Override
	public void area() {
		System.out.println(type + "Area = "
				+ rect.getWidth() * rect.getHeight() / 2.0);
	}
	
	@Override
	public void perimeter() {
		System.out.println(type + "Area = "
				+ (rect.getWidth() * rect.getHeight() + hypotenuse));
	}


}
