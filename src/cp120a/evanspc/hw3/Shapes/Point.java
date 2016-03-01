package cp120a.evanspc.hw3;

class Point extends Shape {
	Point (double x, double y)
    {
	this.x = x;
	this.y = y;
    }
    private double x;
    private double y;

    //if I name this something other than 'area', the compiler complains...
    public double area()
    {
	//       p[0] = x;
	//       p[1] = y;
	//       return p;
        double [] p = {x, y};
	return p;
    }

}
