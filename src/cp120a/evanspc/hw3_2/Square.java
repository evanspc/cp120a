package cp120a.evanspc.hw3_2;

import java.util.List;
import java.util.logging.Logger;

class Square extends Shape {
	
	public Point x1;
	public Point y1;
	public Point x2;
	public Point y2;
	int i;
	

	public static final Logger logger = Logger.getLogger("cp120a_evanspc_hw5");

	public Square(List<Point> points, int i) throws MyIllegalArgumentException {
		if ((points == null || (points.size() != 2)) || (i >= 0)) {
			MyIllegalArgumentException e = new MyIllegalArgumentException("we are expecting exactly two points and a int");
			logger.warning("Throwing " + e);
			throw e;
		}
		logger.fine("logging fine detail in Square");
		
		this.x1 = points.get(0);
		this.y1 = points.get(1);
		this.i = i;
		return ;
	}

	 


	public Square(Point point, int i2) {
		// TODO Auto-generated constructor stub
	}




	@Override
	public void move(double deltaX, double deltaY) {
		x1.move(deltaX, deltaY);
		y1.move(deltaX, deltaY);		
	}

}
