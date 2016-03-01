package cp120a.evanspc.hw3;

class Circle extends Shape 
{
	//when I define radius here, it becomes zero--why?
	private static final double PI = Math.PI; 
	private double diameter;
		
	public Circle (double diameter) 
	{                  
		this.diameter = diameter;
	}
		
	@Override
	public double getArea () 
	{   
    	double radius = diameter / 2.0;
		return PI * radius * radius;
	}
	@Override
	public double getPerimeter()
	//circumference is 2 * Pi * r
	{
		double radius = diameter / 2.0;
		return 2 * PI * (radius/2);
	}
	@Override
	public double getMinBounding()
	{
		return diameter * diameter;
	}
}
