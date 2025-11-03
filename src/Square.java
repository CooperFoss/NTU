public class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public double getSide() {
        return (length+width)/2;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
