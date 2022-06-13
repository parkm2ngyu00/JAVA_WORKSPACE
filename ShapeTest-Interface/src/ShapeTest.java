
public class ShapeTest {

	public static void main(String[] args) {
		//Shape s = new Shape(ShapeType.TRIANGLE, ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		Shape s = new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20)); // upcasting
		s.print(); // dynamic binding toString()
		s.area(); // dynamic binding area()
		s.perimeter();
		s = new Triangle(ShapeColor.GREEN, new ShapeRect(0, 0, 30, 20));
		s.print();
		s.area();
		s.perimeter();
		s = new Square(ShapeColor.BLUE, new ShapeRect(0, 0, 30, 20));
		s.print();
		s.area();
		s.perimeter();
		s = new Circle(ShapeColor.MAGENTA, new ShapeRect(0, 0, 30, 20));
		s.print();
		s.area();
		s.perimeter();
		if (s instanceof Square) {
			Square q = (Square)s; // downcasting
			q.print();
			q.area();
			q.perimeter();
		}
		if (s instanceof Circle) {
			Circle c = (Circle)s; // downcasting
			c.print();
			c.area();
			c.perimeter();
		}
		//Rectangle r = (Rectangle)s; // downcasting
		//r.print();
		
		System.out.println();
		/*Shape[] shapeArray = new Shape[5];
		shapeArray[0] = new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		shapeArray[1] = new Triangle(ShapeColor.GREEN, new ShapeRect(0, 0, 30, 20));
		shapeArray[2] = new Square(ShapeColor.BLUE, new ShapeRect(0, 0, 30, 20));
		shapeArray[3] = new Circle(ShapeColor.MAGENTA, new ShapeRect(0, 0, 30, 20));
		shapeArray[4] = new Rectangle(ShapeColor.CYAN, new ShapeRect(50, 50, 40, 60));
		*/
		Shape[] shapeArray = {
			new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20)),
			new Triangle(ShapeColor.GREEN, new ShapeRect(0, 0, 30, 20)),
			new Square(ShapeColor.BLUE, new ShapeRect(0, 0, 30, 20)),
			new Circle(ShapeColor.MAGENTA, new ShapeRect(0, 0, 30, 20)),
			new Rectangle(ShapeColor.CYAN, new ShapeRect(50, 50, 40, 60))
		};
		for (Shape e :  shapeArray) {
			e.print();
			e.area();
			e.perimeter();
			e.move(10, 20);
			e.scale(3);
			e.print();
			e.area();
			e.perimeter();
			System.out.println();
		}
	}

}
