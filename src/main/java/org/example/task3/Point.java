package org.example.task3;

public class Point implements Movable{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
        System.out.println("The point has moved up. New coordinates: (" + x + ", " + y + ")");
    }

    @Override
    public void moveDown() {
        y--;
        System.out.println("The point has moved down. New coordinates: (" + x + ", " + y + ")");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.println("The point has moved to the left. New coordinates: (" + x + ", " + y + ")");
    }

    @Override
    public void moveRight() {
        x++;
        System.out.println("The point has moved to the right. New coordinates: (" + x + ", " + y + ")");
    }
}
