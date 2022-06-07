
public class Square extends Shape {

	public Square(ShapeColor color, ShapeRect rect) {
		super(shapeType.SQUARE, color, rect);
		if (rect.getWidth() > rect.getHeight()) {
			rect.setWidth(rect.getHeight());
		} else {
			rect.setHeight(rect.getWidth());
		}
	}

	@Override
	public void area() {
		System.out.println("Square Area = " + rect.getWidth() * rect.getWidth());
	}

	@Override
	public String toString() {
		return "Square [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}

}
