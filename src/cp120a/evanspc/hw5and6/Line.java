package hw5and6;
//from 2/3 class session
//import java.util.ArrayList;
//
class Line extends Shape {
	Line (double x1, double y1, double x2, double y2) 
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	private double x1;
	private double y1;
	private double x2;
	private double y2;

	//formula is D = sqrt((x2-x1)^2 + (y2-y1)^2)
	// HOWTO "sqrt" java.lang.Math.sqrt(double a)
	// HOWTO "abs" double abs(double d)
	@Override
	public double getLength (){
		double x_sum = java.lang.Math.abs(x2 - x1);
		double y_sum = java.lang.Math.abs(y2 - y1);
		double x_sq = x_sum * x_sum;
		double y_sq = y_sum * y_sum;
		double xy_sum = x_sq + y_sq;
		double linelength = java.lang.Math.sqrt(xy_sum);
		return linelength;
	}

	// override area and perimeter
	@Override
	public double getArea(){
		return 0;	
	}
	@Override
	public double getPerimeter(){
		return 0;
	}

}
