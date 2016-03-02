package cp120a.evanspc.hw5;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

class Line extends Shape {
	public Point x1;
	public Point y1;
	public Point x2;
	public Point y2;

	public static final Logger logger = Logger.getLogger("cp120a_evanspc_hw5");

	public Line(List<Point> points) throws MyIllegalArgumentException {
		if (points == null || (points.size() != 2)) {
			MyIllegalArgumentException e = new MyIllegalArgumentException("we are expecting exactly two points");
			logger.warning("Throwing " + e);
			throw e;
		}
		logger.fine("logging fine detail in Line");
		
		this.x1 = points.get(0);
		this.y1 = points.get(1);
		this.x2 = points.get(2);
		this.y2 = points.get(3);
	}

	public void move(double deltaX, double deltaY) {
		x1.move(deltaX, deltaY);
		y1.move(deltaX, deltaY);
	}

	public Line(ArrayList<Point> coords) {
		// TODO Auto-generated constructor stub
	}

	// formula is D = sqrt((x2-x1)^2 + (y2-y1)^2)
	// HOWTO "sqrt" java.lang.Math.sqrt(double a)
	// HOWTO "abs" double abs(double d)
	@Override
	public double getLength() {
		 double x_sum = java.lang.Math.abs(x2 - x1);
		 double y_sum = java.lang.Math.abs(y2 - y1);
		 double x_sq = x_sum * x_sum;
		 double y_sq = y_sum * y_sum;
		 double xy_sum = x_sq + y_sq;
		 double linelength = java.lang.Math.sqrt(xy_sum);
		 return linelength;
	}

	// getArea, getPerimeter, getMinBounding are zero, as in superclass Shape
	// getCenter could be done as midpoint

//	@Override
//	public double[] getCenter() {
//		double[] midpoint = null;
//		// mid_x = (x1 + x2)/2
//		// mid_y = (y1 + y2)/2;
//		return midpoint;
//
//	}



	// following, my old constructor based on four doubles
	// private double x1;
	// private double y1;
	// private double x2;
	// private double y2;
	// //constructor
	// Line (double x1, double y1, double x2, double y2)
	// {
	// this.x1 = x1;
	// this.y1 = y1;
	// this.x2 = x2;
	// this.y2 = y2;
	// }

}
