package cp120a.evanspc.hw5;

import java.util.List;
import java.util.logging.Logger;

class Rectangle extends Shape {

	public Point x1;
	public Point y1;
	public Point x2;
	public Point y2;

	public static final Logger logger = Logger.getLogger("cp120a_evanspc_hw5");

	public Rectangle(List<Point> points) throws MyIllegalArgumentException {
		if (points == null || (points.size() != 2)) {
			MyIllegalArgumentException e = new MyIllegalArgumentException("we are expecting exactly two points");
			logger.warning("Throwing " + e);
			throw e;
		}
		logger.fine("logging fine detail in Rectangle");

		this.x1 = points.get(0);
		this.y1 = points.get(1);
		this.x2 = points.get(2);
		this.y2 = points.get(3);
		return;
	}

	int i, j, k, l;

	public Rectangle(int i, int j, int k, int l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

	 double width1 = java.lang.Math.abs(i - k);
	 double length1 = java.lang.Math.abs(j - l);

	@Override
	public double getArea() {
		return width1 * length1;
	}

	@Override
	public double getPerimeter() {
		return width1 + width1 + length1 + length1;
	}

	@Override
	public double getMinBounding() {
		return getArea();
	}

	@Override
	public void move(double deltaX, double deltaY) {
		x1.move(deltaX, deltaY);
		y1.move(deltaX, deltaY);
	}
}
