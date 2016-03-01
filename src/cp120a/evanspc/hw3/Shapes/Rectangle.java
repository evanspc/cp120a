package cp120a.evanspc.hw3;

class Rectangle extends Shape {
	 Rectangle (double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    public double width;        // public for Square
	    public double height; 

	    public double area () {
	        return width * height;
	    }
	    public double perimeter () {
	        return width + width + height + height;
	    }

}
