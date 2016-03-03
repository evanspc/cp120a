package cp120a.evanspc.hw3_2;

import java.util.List;
import java.util.logging.Logger;

class Circle extends Shape {
	private static final double PI = Math.PI;
	private double radius;
	private double diameter;
//	private double x;
//	private double y;

	public Point x1;
	public Point y1;
	
	public static final Logger logger = Logger.getLogger("cp120a_evanspc_hw5");
	
	public Circle(List<Point> points) throws MyIllegalArgumentException {
		if (points == null || (points.size() != 1)) {
			MyIllegalArgumentException e = new MyIllegalArgumentException("we are expecting exactly one point and one double for radius");
			logger.warning("Throwing " + e);
			throw e;
		}
		logger.fine("logging fine detail in Line");
		
		this.x1 = points.get(0);
		this.y1 = points.get(1);
		
	}
	


	public Circle(Point point, double radius) {
		this.radius = radius;		
	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public double getPerimeter()
	// circumference is 2 * Pi * r
	{
		return 2 * PI * (radius / 2);
	}

	@Override
	public double getMinBounding() {
		return diameter * diameter;
	}

	@Override
	public void move(double deltaX, double deltaY) {
		x1.move(deltaX, deltaY);
		y1.move(deltaX, deltaY);

	}
}
