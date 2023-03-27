public class tigaCircle extends tigaShape {
    private double radius;

    public tigaCircle() {
        this.radius = 1.0;
    }

    public tigaCircle(double radius) {
        this.radius = radius;
    }

    public tigaCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle dengan radius=" + radius + ", " + super.toString();
    }
}