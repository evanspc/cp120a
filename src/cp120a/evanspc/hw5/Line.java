package cp120a.evanspc.hw5;

import java.util.ArrayList;


class Line extends Shape {
	public Point p1;
	public Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	// following, my old constructor based on four doubles
//	private double x1;
//	private double y1;
//	private double x2;
//	private double y2;
//	//constructor
//	// the new param passed is a ArrayList
//	Line (double x1, double y1, double x2, double y2) 
//	{
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//	}
	
	
	
	// HERE to next test
	public String name;
	Line (String n)
	{
		name = n;
	}

	public String setName()
	{
		return name;
	}
	//HERE
	public Line(ArrayList<Point> coords) {
		// TODO Auto-generated constructor stub
	}


	//formula is D = sqrt((x2-x1)^2 + (y2-y1)^2)
	// HOWTO "sqrt" java.lang.Math.sqrt(double a)
	// HOWTO "abs" double abs(double d)
	@Override
	public double getLength (){
		return 0.0;
//		double x_sum = java.lang.Math.abs(x2 - x1);
//		double y_sum = java.lang.Math.abs(y2 - y1);
//		double x_sq = x_sum * x_sum;
//		double y_sq = y_sum * y_sum;
//		double xy_sum = x_sq + y_sq;
//		double linelength = java.lang.Math.sqrt(xy_sum);
//		return linelength;
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
	
	double move_x, move_y;
	public double move(double move_x, double move_y){
//		double new_x = x1 + move_x;
//		double new_y = y1 + move_y;
//		//RK: best way to return two doubles?
//		return new double[] {new_x, new_y};
		return 0.0;
	}

	public void setName(String name) {
		//RK: why this? (was one of the solutions from Eclipse)
		// TODO Auto-generated method stub
		
	}

}
