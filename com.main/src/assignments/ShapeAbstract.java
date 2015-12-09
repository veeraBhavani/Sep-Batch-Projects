package assignments;

import java.awt.Shape;

 abstract class ShapeAbstract 
{
	
	    public abstract double area();
	    public abstract double perimeter();
	    public abstract double setSides();
}


class Rectangle extends ShapeAbstract 
{
	   private final double width, length; //sides

	    public Rectangle() 
	    {
	        this(1,1);
	    }
	    public Rectangle(double width, double length) 
	    {
	        this.width = width;
	        this.length = length;
	    }

	    @Override
	    public double area() 
	    {
	        // A = w * l
	        return width * length;
	    }

	    @Override
	    public double perimeter() 
	    {
	        // P = 2(w + l)
	        return 2 * (width + length);
	    }
		@Override
		public double setSides() 
		{
			// TODO Auto-generated method stub
			return 0;
		}
class Circle extends ShapeAbstract {
		    private final double radius;
		    final double pi = Math.PI;

		    public Circle() {
		        this(1);
		    }   
		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    @Override
		    public double area() {
		        // A = π r^2
		        return pi * Math.pow(radius, 2);
		    }

		    public double perimeter() {
		        // P = 2πr
		        return 2 * pi * radius;
		    }
			@Override
			public double setSides() {
				// TODO Auto-generated method stub
				return 0;
			}
		}
	}
class Triangle extends ShapeAbstract 
{
	 private final double a, b, c; // sides

    public Triangle() 
    {
        this(1,1,1);
    }
    
	public Triangle(double a, double b, double c) 
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
/*final class TestShape 
{
    public static void main(String[] args) 
    {

        // Rectangle test
        double width = 5, length = 7;
        ShapeAbstract rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + (rectangle).area()
                + "\nResulting perimeter: " + (ShapeAbstract) rectangle).perimeter() + "\n");

        // Circle test
        double radius = 5;
        ShapeAbstract circle = new circle();
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + ((ShapeAbstract) circle).area()
            + "\nResulting Perimeter: " + ((ShapeAbstract) circle).perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        ShapeAbstract triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }
}

*/