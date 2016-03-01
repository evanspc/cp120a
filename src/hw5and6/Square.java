package hw5and6;

class Square extends Rectangle 
{
	Square (double width, double height) 
	{
		super (width, height);
	}
	@Override
	public double getArea ()
	{
		return width * width;
	}
	@Override
	public double getPerimeter ()
	{
		return width * 4;
	}
	public double getMinBounding()
	{
		return getArea();
	}

}
