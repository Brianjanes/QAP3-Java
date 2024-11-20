package problem4;

public class EquilateralTriangle extends Triangle {

    // Constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);  // Pass the same side length three times to Triangle constructor
    }

    // rejigging the calculate area for this
    @Override
    public double calculateArea() {
        //formula is:
        // Area = (√3/4) * side²
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    // Override scale method to ensure we maintain equilateral property
    @Override
    public void scale(double factor) {
        if (factor <= 0) {
            System.out.println("Error: Scaling factor must be positive!");
            return;
        }
        // Scale all of the sides by the same factor
        // We could use any of side1, side2, or side3 since they're all equal
        double newSide = side1 * factor;
        setSide(newSide);
    }

    // calculatePerimeter from Triangle class should be fine here

    // Getter for side (since all sides should be equal, we only need one getter)
    public double getSide() {
        return side1;
    }

    // Setter for side (sets all sides to same value)
    public void setSide(double side) {
        side1 = side;
        side2 = side;
        side3 = side;
    }

    // Override toString to show it's specifically an equilateral triangle
    @Override
    public String toString() {
        return "Equilateral " + super.toString() + "\nSide length: " + String.format("%.2f", side1);
    }
}