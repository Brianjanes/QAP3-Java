package problem4;

public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of scale method from Scalable interface
    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    //setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}