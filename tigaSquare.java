public class tigaSquare extends tigaRectangle {
    public tigaSquare() {
        super();
    }

    public tigaSquare(double side) {
        super(side, side);
    }

    public tigaSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Square hanya memiliki 1 sisi, yaitu lebar dan panjang yang sama
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString() {
        return "Square dengan side=" + getSide() + ", " + super.toString();
    }
}