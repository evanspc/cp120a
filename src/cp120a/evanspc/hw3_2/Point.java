package cp120a.evanspc.hw3_2;

import java.util.List;
import java.util.logging.*;


public class Point extends Shape {
  public Point x;
  public Point y;
  
  private static final Logger logger = Logger.getLogger("cp120a_evanspc_hw5");
  
	public Point(List<Point> points) throws MyIllegalArgumentException {
		if (points == null || (points.size() != 1)) {
			MyIllegalArgumentException e = new MyIllegalArgumentException("we are expecting exactly one point");
			logger.warning("Throwing " + e);
			throw e;
		}
		logger.fine("logging fine detail in Point");
		this.x = points.get(0);
		this.y = points.get(1);
	}
  
// now deprecated, though conceptually simpler... 
  public Point(double x, double y) {
//    this.x = x;
//    this.y = y;
  }


  @Override
	public void move(double deltaX, double deltaY) {
		x.move(deltaX, deltaY);
		y.move(deltaX, deltaY);
	}
}

















//
//
//
////HERE
//class Point extends Shape {
//
//	private double x;
//	private double y;
//	private ArrayList<Integer> p_ary;
//	// private String result;
//
//	public Point(double x, double y) {
//		// RK - better way?
//		if (Double.valueOf(x).equals("") || Double.valueOf(y).equals("")) {
//			// throw new MyIllegalArgument("points must not be null");
//		}
//
//		this.x = x;
//		this.y = y;
//	}
//
//	// constructor for ArrayList (hw5)
//	public Point(ArrayList<Integer> nums) {
//		p_ary = nums;
//		for (int num : nums) {
//			System.out.println(num);
//		}
//
//	}
//
//	public double getX() {
//		return x;
//	}
//
//	public void setX(double x) {
//		this.x = x;
//	}
//
//	public double getY() {
//		return y;
//	}
//
//	public void setY(double y) {
//		this.y = y;
//	}
//
//	@Override
//	public void move(double deltaX, double deltaY) {
//		this.x += deltaX;
//		this.y += deltaY;
//	}
//
//}
