public class tigaShape {
    private String color;
    private boolean filled;

    public tigaShape() {
        this.color = "red";
        this.filled = true;
    }

    public tigaShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape berwarna " + color + " dan filled " + filled;
    }
}