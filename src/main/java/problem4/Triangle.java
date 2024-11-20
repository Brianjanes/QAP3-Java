package problem4;

public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    // Constructor with triangle validation
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: These sides cannot form a triangle!");
            System.exit(1);
        }
    }

    // validation helper to make sure the triangle makes sense
    private boolean isValidTriangle(double a, double b, double c) {
        // Triangle inequality theorem: sum of any two sides must be greater than third side
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    // Implementation of scale method from Scalable interface
    @Override
    public void scale(double factor) {
        // We don't need to check isValidTriangle here because if the original
        // triangle was valid, scaling all sides by the same positive factor
        // will always result in a valid triangle
        if (factor <= 0) {
            System.out.println("Error: Scaling factor must be positive!");
            return;
        }

        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        // Heron's formula
        double s = calculatePerimeter() / 2;  // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //Getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Setters with validation
    public void setSide1(double side1) {
        if (isValidTriangle(side1, this.side2, this.side3)) {
            this.side1 = side1;
        } else {
            System.out.println("Error: New side length would not form a valid triangle!");
            System.exit(1);
        }
    }

    public void setSide2(double side2) {
        if (isValidTriangle(this.side1, side2, this.side3)) {
            this.side2 = side2;
        } else {
            System.out.println("Error: New side length would not form a valid triangle!");
            System.exit(1);
        }
    }

    public void setSide3(double side3) {
        if (isValidTriangle(this.side1, this.side2, side3)) {
            this.side3 = side3;
        } else {
            System.out.println("Error: New side length would not form a valid triangle!");
            System.exit(1);
        }
    }
}