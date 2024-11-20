package problem4;

public class Ellipse extends Shape {
    private double majorAxis;  // a
    private double minorAxis;  // b

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 > axis2) {
            this.majorAxis = axis1;
            this.minorAxis = axis2;
        } else {
            this.majorAxis = axis2;
            this.minorAxis = axis1;
        }
    }

    @Override
    public double calculatePerimeter() {
        //formula is:
        // P = π√2(a² + b²) - (a - b)²/2
        double a2 = majorAxis * majorAxis;
        double b2 = minorAxis * minorAxis;
        return Math.PI * Math.sqrt(2 * (a2 + b2) - Math.pow(majorAxis - minorAxis, 2) / 2);
    }

    @Override
    public double calculateArea() {
        //formula is:
        // A = πab
        return Math.PI * majorAxis * minorAxis;
    }

    // Implementation of scale method from Scalable interface
    // the ratio between major and minor axes remains the same after scaling
    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }

    // Getters
    public double getMajorAxis() {
        return majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    // Setters
    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    // If you want to set both axes at once
    public void setAxes(double axis1, double axis2) {
        if (axis1 > axis2) {
            this.majorAxis = axis1;
            this.minorAxis = axis2;
        } else {
            this.majorAxis = axis2;
            this.minorAxis = axis1;
        }
    }
}