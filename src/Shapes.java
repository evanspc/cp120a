//package cp120a.evanspc.hw3;

public class Shapes {

	public static void main(String[] args) {


		//VARIABLES
		double x;
		double y;
		x = 4; y = 5; // <- change!
		double height;
		double width;
		double length;
		double area;
		double radius;
		double perimeter;
		String shapeName;

		// below doesn't work?
//		public Shapes()
//		{
//		x = 0;
//		y = 0;
//		length = 0;
//		width = 0;
//		height = 0;
//	    area = 0;
//	    radius = 0;
//	    perimeter = 0;
//	    shapeName = "point";	
//	    }
		
		ShapeCalc calc = new ShapeCalc();
		System.out.println("getArea: " + calc.getArea(x, y));
		System.out.println("getPerimeter: " + calc.getPerimeter(x, y));
	}

}//public class Shapes

//I think I need to be able to call the methods with differing params,
//such as (x, y) for "point" and (x1, y1, x2, y2) for line etc

class ShapeCalc{

	//accessor methods
	public double getArea(double a, double b){
		return a * b;
	}
	public double getPerimeter(double a, double b){
		return (a * 2) + (b * 2);
	}
	
	
	//METHODS	
	//	 getArea() returns double
	//
	//	  getPerimeter() returns double
	//
	//	  getMinimumBoundingRectangle() returns Rectangle
}//class ShapeCalc



