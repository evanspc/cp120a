package cp120a.evanspc.hw5and6;

public class ShapeTest {
	public static void main(String[] args) {
		double circleDia = 2.5;
		double rectWidth = 5.0;
		double rectHeight = 4.0;
		double sqSide = 3.0;
		double lineX1 = 2.0;
		double lineY1 = 3.0;
		double lineX2 = 12.0;
		double lineY2 = 13.0;
		double pointX = 1.0;
		double pointY = 2.0;
		double triX1 = 1.0;
		double triY1 = 1.0;
		double triX2 = 1.0;
		double triY2 = 5.0;
		double triX3 = 3.0;
		double triY3 = 3.0;
		
		Shape s1 = new Circle (circleDia);
		Shape s2 = new Rectangle (rectWidth, rectHeight);
		Shape s3 = new Square (sqSide, sqSide);
		Shape s4 = new Line (lineX1, lineY1, lineX2, lineY2);
		Shape s5 = new Point (pointX, pointY);
		Shape s6 = new Triangle (triX1, triY1, triX2, triY2, triX3, triY3);
		
        //Circle
		System.out.println ("CIRCLE");
		System.out.println ("	Diameter of " + circleDia + " produces area " + s1.getArea());
		System.out.println ("	Diameter of "+ circleDia + " produces circumference " + s1.getPerimeter());
		System.out.println ("	Diameter of "+ circleDia + " produces minimum bounding area " + s1.getMinBounding());
		System.out.println();
		
		//Rectangle
		System.out.println ("RECTANGLE");
		System.out.println ("	Sides of " + rectWidth + " and " + rectHeight + " produces area " + s2.getArea());
		System.out.println ("	Sides of " + rectWidth + " and " + rectHeight + " produces perimeter " + s2.getPerimeter());
		System.out.println ("	Sides of " + rectWidth + " and " + rectHeight + " produces minimum bounding area " + s2.getMinBounding());
		System.out.println();
		
		//Square
		System.out.println ("SQUARE");
		System.out.println ("	Side of " + sqSide + " produces area " + s3.getArea());
		System.out.println ("	Side of " + sqSide + " produces perimeter " + s3.getPerimeter());
		System.out.println ("	Side of " + sqSide + " produces minimum bounding area " + s3.getMinBounding());
		System.out.println();
		
		//Line
		System.out.println ("LINE");
		System.out.println ("	Points " + lineX1 + "," + lineY1 + " and " + lineX2 + "," + lineY2 + " produces length " + s4.getLength());
		System.out.println ("	Points " + lineX1 + "," + lineY1 + " and " + lineX2 + "," + lineY2 + " produces area " + s4.getArea());
		System.out.println ("	Points " + lineX1 + "," + lineY1 + " and " + lineX2 + "," + lineY2 + " produces perimeter " + s4.getPerimeter());
		System.out.println();
		
		//Point
		System.out.println ("POINT");
		//System.out.println ("	Located at " + pointX + ", " + pointY + " is at " + s5.getX() + ", " + s5.getY());
		System.out.println ("	Located at " + s5.toString());
		System.out.println();
		
		//Triangle
		System.out.println ("TRIANGLE");
		System.out.println ("	Vertices at " + triX1 + "," + triY1 + " " + triX2 + "," + triY2 + " " + triX3 + "," + triY3 + " produces area " + s6.getArea());
		System.out.println ("	Vertices at " + triX1 + "," + triY1 + " " + triX2 + "," + triY2 + " " + triX3 + "," + triY3 + " produces perimeter " + s6.getPerimeter());
		// not working...
		//System.out.println ("	Vertices at " + triX1 + "," + triY1 + " " + triX2 + "," + triY2 + " " + triX3 + "," + triY3 + " produces center " + s6.getCenter());
	}
}
