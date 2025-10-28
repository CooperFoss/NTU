public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape(){}
    public Shape(String color, boolean filled) {
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
    public double getArea() {
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
