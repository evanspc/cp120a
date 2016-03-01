package cp120a.evanspc.hw3;

class Triangle extends Shape 
{
	private double a1;
	private double b1;
	private double a2;
	private double b2;
	private double a3;
	private double b3;

	public Triangle (double a1, double b1, double a2, double b2, double a3, double b3) 
	{                  
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;
		this.a3 = a3;
		this.b3 = b3;
	}

	@Override
	public double useLine() {
		//this is very ugly
		Line aline = new Line(a1, b1, a2, b2);
		double lineOne = aline.getLength();
		Line bline = new Line(a1, b1, a3, b3);
		double lineTwo = bline.getLength();
		Line cline = new Line(a3, b3, a2, b2);
		double lineThree = cline.getLength();
		//System.out.println("UseLine" + lineOne);
		return lineOne + lineTwo + lineThree;
	}
	@Override

	public double getArea ()
	{
		//area formula
		// area = 0.5 * abs((a1(b2-b3)) + (a2(b3-b1)) + (a3(b1-b2)))
		double tmp = ((a1 * (b2-b3)) + (a2 * (b3-b1)) + (a3 * (b1-b2)));
		tmp = java.lang.Math.abs(tmp);
		return 0.5 * tmp;
	}

	@Override
	public double getPerimeter()
	{
		return useLine();
	}

	double xcenter;
	double ycenter;
	double result[];
	public double [] getCenter()
	{
		//x = x1+x2+x3/3
	    xcenter = (a1 + a2 +a3)/3;
	    ycenter = (b1 + b2 +b3)/3;
	    result[0] = xcenter;
	    result[1] = ycenter;
	    //System.out.println("xcenter" + xcenter + " ycenter" + ycenter);
	    return result;
	}
	

}

