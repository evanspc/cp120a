package cp120a.evanspc.hw3;

class Square extends Shape {
	Square (double width, double height){
		this.width = width;
		this.height = height;
	    }

	    private double width;
	    private double height;

	    public double area (){
		//        System.out.println ("Square area" + area);
	        return width * width;
	    }
	    public double perimeter (){
		//        System.out.println ("Square perimeter" + perimeter);
		return width * 4;
	    }

}
