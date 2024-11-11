package problem2;

import java.util.List;

public class Point {
    protected float pointX;
    protected float pointY;

    public Point(float x, float y) {
        pointX = x;
        pointY = y;
    }

    public Point() {
    }

    //Getters
    public float getX() {
        return pointX;
    }
    public float getY() {
        return pointY;
    }

    public float[] getXY() {
        return new float[]{pointX, pointY};
    }

    //Setters
    public void setX(float x) {
        pointX = x;
    }

    public void setY(float y) {
        pointY = y;
    }

    public void setXY(float x, float y) {
        pointX = x;
    }

    //ToString Method
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}