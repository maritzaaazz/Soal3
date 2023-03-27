public class tigaMain {
    public static void main(String[] args) {
        // membuat objek Circle
        tigaCircle circle1 = new tigaCircle();
        tigaCircle circle2 = new tigaCircle(2.5);
        tigaCircle circle3 = new tigaCircle(3.0, "blue", false);

        // memanggil method pada objek Circle
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Filled: " + circle1.isFilled());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Filled: " + circle2.isFilled());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println(circle2.toString());
        System.out.println();

        System.out.println("Circle 3:");
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Color: " + circle3.getColor());
        System.out.println("Filled: " + circle3.isFilled());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());
        System.out.println(circle3.toString());
        System.out.println();

        // membuat objek Rectangle
        tigaRectangle rectangle1 = new tigaRectangle();
        tigaRectangle rectangle2 = new tigaRectangle(2.5, 3.0);
        tigaRectangle rectangle3 = new tigaRectangle(4.0, 5.0, "green", true);

        // memanggil method pada objek Rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Filled: " + rectangle1.isFilled());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Filled: " + rectangle2.isFilled());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.toString());
        System.out.println();

        System.out.println("Rectangle 3:");
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Color: " + rectangle3.getColor());
        System.out.println("Filled: " + rectangle3.isFilled());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.toString());
        System.out.println();
    }
}