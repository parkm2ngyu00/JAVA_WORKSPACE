
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
	public String toString() {
		return "Square [type=" + type + ", color=" + color + ", rect=" + rect + "]";
	}

}
