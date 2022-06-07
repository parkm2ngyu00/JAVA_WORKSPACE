
public abstract class Shape {
	protected shapeType type;
	protected ShapeColor color;
	protected ShapeRect rect;
	
	public Shape(shapeType type, ShapeColor color, ShapeRect rect) {
		super();
		this.type = type;
		this.color = color;
		this.rect = rect;
	}

	public abstract void area();
	
	public void print() {
		System.out.println(this);
	}
	
}
