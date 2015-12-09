package assignments;

 class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        //double width = 5, length = 7;
        /*ShapeAbstract rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + (rectangle).area()
                + "\nResulting perimeter: " + (ShapeAbstract) rectangle).perimeter() + "\n");
*/
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