package cp120a.evanspc.hw3;

class Point extends Shape {
	Point (double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	private double x;
	private double y;
	private String result;

	@Override
	public String toString() {
		result = "Point [x=" + x + ", y=" + y + "]";
		return result;
	}
	@Override
	public double getArea()
	{
		return 0;
	}
	public double getX ()
	{
		return x;
	}
	public double getY ()
	{
		return y;
	}
}
