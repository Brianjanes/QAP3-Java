package problem2;

public class MovablePoint extends Point {
    private float xSpeedPoint;
    private float ySpeedPoint;

    //Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeedPoint = xSpeed;
        this.ySpeedPoint = ySpeed;
    }

    public MovablePoint(float x, float y) {
        super(x, y);  // Call Point constructor with x,y
        this.xSpeedPoint = 0.0f;
        this.ySpeedPoint = 0.0f;
    }

    public MovablePoint() {
        super();  // Call Point's no-arg constructor
        this.xSpeedPoint = 0.0f;
        this.ySpeedPoint = 0.0f;
    }

    //Getters
    public float getXSpeed() {
        return xSpeedPoint;
    }

    public float getYSpeed() {
        return ySpeedPoint;
    }

    public float[] getSpeed() {
        return new float[] {xSpeedPoint, ySpeedPoint};
    }

    //Setters
    public void setXSpeed(float xSpeed) {
        this.xSpeedPoint = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeedPoint = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeedPoint = xSpeed;
        this.ySpeedPoint = ySpeed;
    }

    //Methods
    public MovablePoint move() {
        setX(getX() + xSpeedPoint);  // Use inherited setX/getX methods
        setY(getY() + ySpeedPoint);  // Use inherited setY/getY methods
        return this;
    }

    //ToString method
    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeedPoint + "," + ySpeedPoint + ")";
    }
}