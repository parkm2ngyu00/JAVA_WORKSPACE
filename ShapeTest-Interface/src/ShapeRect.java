
public class ShapeRect {
	private int x;
	private int y;
	private int width;
	private int height;
	
	// constructor
	public ShapeRect(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// toString
	@Override
	public String toString() {
		return "ShapeRect [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}	
}
