package cp120a.evanspc.hw5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.*;
import static org.junit.Assert.*;

public class ShapeTest {

	public static final Logger logger = Logger.getLogger("cp120a_evanspc_hw5");

	public static void main(String[] args) throws MyIllegalArgumentException, Exception, IOException {

		// exception counter
		int currentExceptionCount = MyIllegalArgumentException.exceptionCount();

		FileHandler fileHandler = new FileHandler("cp120a_evanspc_hw5-log.xml");
		fileHandler.setLevel(Level.ALL);
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		logger.addHandler(fileHandler);
		logger.addHandler(consoleHandler);
		logger.setLevel(Level.ALL);
		logger.info("I am in ShapeTest main");

		ArrayList<Point> coords = new ArrayList<>();

		Point pointA = new Point(1000, 1000);
		pointA.setName("pointA");
		coords.add(new Point(0, 0));
		coords.add(new Point(1, 0));
		coords.add(new Point(1, 1));

		Line lineA = new Line(coords.get(0), coords.get(1));
		lineA.setName("lineA");
		lineA.move(40, 0);

		double radius = 5;
		Circle circleA = new Circle(new Point(0, 0), radius);
		circleA.setName("circleA");
		circleA.move(20, 25);

		Rectangle rectangleA = new Rectangle(0, 0, 15, 20);
		rectangleA.setName("rectangleA");
		rectangleA.move(-10, 20);
		
		 Square squareA = new Square(new Point(0,0),5);
		 squareA.setName("squareA");
		 squareA.move(20, -10);
		
		 Triangle triangleA = new Triangle(new Point(0,0),new Point(11,0),new
		 Point(1,11));
		 triangleA.setName("triangleA");
		 triangleA.move(100, -10);
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(pointA);
		shapes.add(lineA);
		shapes.add(circleA);
		shapes.add(rectangleA);
		shapes.add(squareA);
		// shapes.add(triangleA);
		// //
		// //Sort by area, smaller first
		Collections.sort(shapes, (first, second) -> (int) first.getArea() - (int) second.getArea());
		//printName("Sort by area", shapes);
		// //Sort by perimeter, shorter first
		Collections.sort(shapes, (first, second) -> (int) first.getPerimeter() - (int) second.getPerimeter());
		//printName("Sort by perimeter", shapes);
		// //Sort by minimum bounding box's center point' x coord
		// Collections.sort(shapes, ??);
		// printName("Sort by MBR center x coord", shapes);
		//
	}


	// Sort by area, smaller first
	// Lambda function lifted directly from Chris on Slack. Was hoping to understand/reverse
	// engineer it
	// Collections.sort(shapes,(first,second) ->
	// (int)first.getArea()-(int)second.getArea());
	// printName("Sort by area", shapes);
	// //Sort by perimeter, shorter first
	// Collections.sort(shapes,(first,second) ->
	// (int)first.getPerimeter()-(int)second.getPerimeter());
	// printName("Sort by perimeter", shapes);
	// //Sort by minimum bounding box's center point' x coord
	// Collections.sort(shapes,(first, second) ->
	// (int)first.getMinimumBoundingRectangle().getCenterPoint().getX()-(int)second.getMinimumBoundingRectangle().getCenterPoint().getX());
	// printName("Sort by MBR center x coord", shapes);

	private static void printName(String title, ArrayList<Shape> shapes) {
		System.out.println(title);
		for (Shape s : shapes) {
			System.out.print(s.getName() + ",");
		}
		System.out.println();
	}

}
