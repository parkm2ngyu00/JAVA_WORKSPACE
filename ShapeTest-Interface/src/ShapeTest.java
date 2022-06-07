import java.util.Arrays;

public class ShapeTest {

	public static void main(String[] args) {
		//Shape s = new Shape(ShapeType.TRIANGLE, ShapeColor.RED, new ShapeRect(0, 0, 30, 20));
		Shape s = new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 30, 20)); // upcasting
		s.print(); // dynamic binding toString()
		s.area(); // dynamic binding area()
		s.perimeter();
		s.move(5, 7);
		s.scale(2);
		s.print();
		s.area();
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
			Square q = (Square)s; 
			q.print();
			q.area();
			q.perimeter();
		}
		if (s instanceof Circle) {			
			Circle c = (Circle)s; 
			c.print();
			c.area();
			c.perimeter();
		}
		if (s instanceof Rectangle) {			
			Rectangle r = (Rectangle)s; 
			r.print();
			r.area();
			r.perimeter();
		}
		
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
			new Triangle(ShapeColor.GREEN, new ShapeRect(0, 0, 40, 20)),
			new Square(ShapeColor.BLUE, new ShapeRect(0, 0, 50, 20)),
			new Circle(ShapeColor.MAGENTA, new ShapeRect(0, 0, 30, 30)),
			new Rectangle(ShapeColor.CYAN, new ShapeRect(50, 50, 40, 60))
		};
		System.out.println("Original");
		for (Shape e : shapeArray) {
			e.print();
		}
		System.out.println("After Sort");
		Arrays.sort(shapeArray); // sort by default Comparable<Shape>
		for (Shape e : shapeArray) {
			e.print();
		}
		
		System.out.println("\nlambda");
		int x = 10;
		int y = 5;
		IScalable is = new IScalable() {
			@Override
			public void scale(int factor) {
				System.out.println(x * factor);
			}
		};
		is.scale(5);
		IScalable is2 = factor -> System.out.println(x * factor);
		is2.scale(3);
		IMoveable is3 = new IMoveable() {
			@Override
			public void move(int x1, int y1) {
				System.out.printf("After move : %d, %d\n", x + x1, y + y1);
			}
		};
		is3.move(10, 10);
		IMoveable is4 = (x1, y1) -> System.out.printf("After move : %d, %d\n", x + x1, y + y1);
		is4.move(100, 100);
		
//		for (Shape e :  shapeArray) {
//			e.print();
//			e.area();
//			e.perimeter();
//		}
	}

}
