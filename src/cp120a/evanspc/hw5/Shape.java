package cp120a.evanspc.hw5;

public class Shape {
	//TODO
	//still need to implement center point

	// no arg constructor
	Shape()
	{
		// this is the no-args constructor, why is it necessary?
	}
	//constructor for name
	public String name;
	Shape (String n)
	{
		name = n;
	}

	public String setName()
	{
		return name;
	}

	public double getArea ()
	{
		//area is zero in this class
		return 0;     
	}
	public double getPerimeter ()
	{
		//area is zero in this class
		return 0;     
	}
	public double getMinBounding ()
	{
		return 0;
	}
	//I only want this in Line, how to do it?
	public double getLength ()
	{
		//area is zero in this class
		return 0;     
	}
	//same, I only want this in Point
	public double getX ()
	{
		return 0;
	}
	public double getY ()
	{
		return 0;
	}
	public double useLine() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double [] getCenter() {
		// TODO Auto-generated method stub
		return null ;
	}

}
