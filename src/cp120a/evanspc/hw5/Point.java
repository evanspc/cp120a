package cp120a.evanspc.hw5;

class Point extends Shape {
	private double x;
	private double y;
	//private String result;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public void move(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}

	// @Override
	// public String toString() {
	// result = "Point [x=" + x + ", y=" + y + "]";
	// return result;
	// }

}
