package problem4;

public class Demo {
    // Static method to scale an array of shapes
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            System.out.println("\nScaling by factor: " + factor);
            System.out.println("Before scaling:");
            System.out.println(shape); // Print before scaling

            shape.scale(factor);

            System.out.println("\nAfter scaling:");
            System.out.println(shape); // Print after scaling
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create various shapes
        Circle circle = new Circle("My Circle", 5.0);
        Ellipse ellipse = new Ellipse("My Ellipse", 6.0, 4.0);
        Triangle triangle = new Triangle("My Triangle", 3.0, 4.0, 5.0);
        EquilateralTriangle eqTriangle = new EquilateralTriangle("My Equilateral Triangle", 4.0);

        // Create an array of shapes that implement Scalable
        Scalable[] shapes = {circle, ellipse, triangle, eqTriangle};

        // First, print all original shapes
        System.out.println("Original Shapes:");
        System.out.println("----------------------------------------");
        for (Scalable shape : shapes) {
            System.out.println(shape);
            System.out.println("----------------------------------------");
        }

        // Scale all shapes by 2.0 (double the size)
        System.out.println("\nDemonstrating scaling operations:");
        scaleShapes(shapes, 2.0);

        // Scale all shapes by 0.5 (half the size - back to original)
        System.out.println("\nScaling back to original size:");
        scaleShapes(shapes, 0.5);

        // Try an invalid scale factor
        System.out.println("\nTrying invalid scale factor:");
        scaleShapes(shapes, -1.0); // This should print error messages
    }
}