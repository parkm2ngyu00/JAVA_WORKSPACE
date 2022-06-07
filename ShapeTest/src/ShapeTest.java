
public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		s.print();
		s.area();
		s = new Triangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		s.print();
		s.area();
		s = new Square(ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		s.print();
		s.area();
		s = new Circle(ShapeColor.RED, new ShapeRect(0, 0, 20, 20));
		s.print();
		s.area();
		
		Shape[] shapeArray = new Shape[5];
		shapeArray[0] = new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		shapeArray[1] = new Triangle(ShapeColor.BLUE, new ShapeRect(0, 0, 30, 20));
		shapeArray[2] = new Square(ShapeColor.CYAN, new ShapeRect(0, 0, 30, 20));
		shapeArray[3] = new Circle(ShapeColor.MAGENTA, new ShapeRect(0, 0, 30, 20));
		shapeArray[4] = new Rectangle(ShapeColor.GREEN, new ShapeRect(0, 0, 30, 20));
		for (Shape e : shapeArray) {
			e.print();
			e.area();
		}
	}

}
