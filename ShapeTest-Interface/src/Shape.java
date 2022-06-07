
public abstract class Shape implements IArea, Iperimeter, IMoveable, IScalable, Comparable<Shape> {
	
	protected ShapeType type;
	protected ShapeColor color;
	protected ShapeRect rect;
	
	// constructor
	public Shape(ShapeType type, ShapeColor color, ShapeRect rect) {
		this.type = type;
		this.color = color;
		this.rect = rect;
	}
	
	public void print() {
		System.out.println(this.toString()); // toString
	}
	
	@Override
	public void move(int x, int y) {
		rect.setX(rect.getX() + x);
		rect.setY(rect.getY() + y);
	}

	@Override
	public void scale(int factor) {
		rect.setWidth(rect.getWidth() * factor);
		rect.setHeight(rect.getHeight() * factor);
	}
	
	@Override
	public int compareTo(Shape other) {
		// ascending order
		return this.rect.getWidth() * this.rect.getHeight() - other.rect.getWidth() * other.rect.getHeight();
	}
}
