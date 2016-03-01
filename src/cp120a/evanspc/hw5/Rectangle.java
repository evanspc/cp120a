package cp120a.evanspc.hw5;

class Rectangle extends Shape {
	Rectangle (double width, double height) 
	{
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double width;
	public double height; 

	@Override
	public double getArea () {
		return width * height;
	}
	@Override
	public double getPerimeter () {
		return width + width + height + height;
	}
	@Override
	public double getMinBounding()
	{
		return getArea();
	}
}
