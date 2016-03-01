package cp120a.evanspc.hw5;

class Point extends Shape {
	private double x;
	private double y;
	private String result;
	Point (double x, double y)
	{
		this.x = x;
		this.y = y;
	}

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
    // why is this required?
	public void setName(String name) {
	}
}
