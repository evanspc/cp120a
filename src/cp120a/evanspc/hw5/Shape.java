package cp120a.evanspc.hw5;

public class Shape implements Movable, Named {
	// TODO
	// still need to implement center point

	public String name;

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
	public void move(double deltaX, double deltaY) {
		// TODO implement interface Movable

	}

}
