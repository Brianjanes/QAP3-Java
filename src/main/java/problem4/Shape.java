package problem4;

public abstract class Shape implements Scalable {
    protected String name;

    // super constructor
    public Shape(String name) {
        this.name = name;
    }

    // abstract methods
    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    // Since Shape is abstract, we don't need to implement scale() here
    // Each subclass will implement their own scaling logic

    //Getters
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    // toString method
    @Override
    public String toString() {
        return "Shape: " + name +
                "\nArea: " + String.format("%.2f", calculateArea()) +
                "\nPerimeter: " + String.format("%.2f", calculatePerimeter());
    }
}