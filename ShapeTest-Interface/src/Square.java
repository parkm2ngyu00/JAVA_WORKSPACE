
public class Square extends Rectangle {

	public Square(ShapeColor color, ShapeRect rect) {
		super(color, rect);
		type = ShapeType.SQUARE;
		// set width == height
		if (rect.getWidth() > rect.getHeight()) {
			rect.setWidth(rect.getHeight());
		} else {
			rect.setHeight(rect.getWidth());
		}
	}

	@Override
	public void area() {
		System.out.println("Square Area = "
				+ rect.getWidth() * rect.getHeight());
	}
	
	@Override
	public void perimeter() {
		System.out.println(type + "Perimeter = "
				+ 2 * (rect.getWidth() + rect.getHeight()));
	}
	
	@Override
	public String toString() {
		return "Square [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}

}
