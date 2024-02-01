package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double dx) {
        this.x += dx;
    }

    public void shiftY(double dy) {
        this.y += dy;
    }

    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}
