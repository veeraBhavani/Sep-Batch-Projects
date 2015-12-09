package assignments;


	public class TriangleShape extends ShapeAbstract 
	{
	    private final double a, b, c; // sides

	    
	    
		public TriangleShape(double a, double b, double c) 
	    {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    @Override
	    public double area() 
	    {
	        
	        double s = (a + b + c) / 2;
	        return s;
	    }

	    @Override
	    public double perimeter() 
	    {
	        // P = a + b + c
	        return a + b + c;
	    }
		@Override
		public double setSides() 
		{
			// TODO Auto-generated method stub
			return 0;
		}
	}

