public class Circle extends Shape{
    protected double radius = 1.0;
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*3.1415;
    }

    public double getPerimeter() {
        return radius*2*3.1415;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                " color="+getColor()+
                " filled="+isFilled()+
                '}';
    }
}
