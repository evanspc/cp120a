package cp120a.evanspc.hw5;
//import cp120a.evanspc.hw3.*; // TODO change this to where the correct shape test files are
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class ShapeTest {

	public static void main(String[] args) throws NoSuchMethodException{		
		// TODO ^ need a better exception
		ArrayList<Point> coords = new ArrayList<>();

		Point pointA = new Point(1000,1000);
		pointA.setName("pointA");		
		coords.add(new Point(0,0));
		coords.add(new Point(1,0));
		coords.add(new Point(1,1));

		Line lineA = new Line(coords);
		lineA.setName("lineA");
		lineA.move(40, 0);

		double radius = 5;
		Circle circleA = new Circle(new Point(0,0), radius);
		circleA.setName("circleA");
		circleA.move(20, 25);

		Rectangle rectangleA = new Rectangle(0,0,15,20);
		rectangleA.setName("rectangleA");
		rectangleA.move(-10, 20);

		Square squareA = new Square(new Point(0,0),5);
		squareA.setName("squareA");
		squareA.move(20, -10);

		Triangle triangleA = new Triangle(new Point(0,0),new Point(11,0),new Point(1,11));
		triangleA.setName("triangleA");
		triangleA.move(100, -10);

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(pointA);
		shapes.add(lineA);
		shapes.add(circleA);
		shapes.add(rectangleA);
		shapes.add(squareA);
		shapes.add(triangleA);

		//Sort by area, smaller first
		Collections.sort(shapes,??);
		printName("Sort by area", shapes);
		//Sort by perimeter, shorter first
		Collections.sort(shapes, ??);
		printName("Sort by perimeter", shapes);
		//Sort by minimum bounding box's center point' x coord
		Collections.sort(shapes, ??);
		printName("Sort by MBR center x coord", shapes);

	}

	private static void printName(String title,ArrayList<Shape> shapes) {
		System.out.println(title);
		for (Shape s: shapes) {
			System.out.print(s.getName() +",");
		}
		System.out.println();
	}

}

