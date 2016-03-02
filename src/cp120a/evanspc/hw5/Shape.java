package cp120a.evanspc.hw5;

public abstract class Shape implements Movable, Named {

	private String name;

	public Shape() {
	}

	public Shape(String n) {
		name = n;
	}

	public double getArea() {
		// area is zero in this class
		return 0;
	}

	public double getPerimeter() {
		// area is zero in this class
		return 0;
	}

	public double getMinBounding() {
		return 0;
	}

	// I only want this in Line, how to do it?
	public double getLength() {
		// area is zero in this class
		return 0;
	}

	// same, I only want this in Point
	public double getX() {
		return 0;
	}

	public double getY() {
		return 0;
	}

	public double useLine() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double[] getCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	// Interface Named
	@Override
	public void setName(String name) {
		this.name = name;

	}

	// Interface Named
	@Override
	public String getName() {
		return name;
	}

	// Interface Movable
	@Override
	// abstract, as class
	public abstract void move(double deltaX, double deltaY);
		// nothing here, just to fulfill interface requirement
		// sub-classes must do the actual work
	

}
