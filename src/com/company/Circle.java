package com.company;

/*
Trang Hoang
CS111B - Assignment 3A
 */

public class Circle {
    private double x;
    private double y;
    private double radius;


    /**
     * Sets the x coordinate of a circle.
     * @param value Location of the x coordinate
     */

    public void setX(double value) {
        x = value;
    }


    /**
     * Gets the x coordinate of a circle.
     * @return Location of the x coordinate
     */

    public double getX() {
        return x;
    }


    /**
     * Sets the y coordinate of a circle.
     * @param value Location of the y coordinate
     */

    public void setY(double value) {
        y = value;
    }


    /**
     * Gets the y coordinate of a circle.
     * @return Location of the y coordinate.
     */

    public double getY() {
        return y;
    }


    /**
     * Sets the radius of a circle.
     * @param value Length of a radius
     */

    public void setRadius(double value) {
        radius = value;
    }


    /**
     * Gets the radius of a circle.
     * @return Length of a radius
     */

    public double getRadius() {
        return radius;
    }


    /**
     * Calculates the area of a circle.
     * @return The area of a circle
     */

    public double getArea() {
        double pi = 3.141519;
        return (pi * Math.pow(radius, 2));
    }


    /**
     * Determines whether two circles touch or overlap. Returns true if they do, and false otherwise.
     * @param otherCircle Circle object for another circle
     * @return True if the two circles touch or overlap. Otherwise, false
     */

    public boolean doesOverlap(Circle otherCircle) {
        double distance;

        distance = Math.pow(Math.pow((x - otherCircle.x), 2) + Math.pow((y - otherCircle.y), 2), 0.5);
        System.out.println("distance: " + distance);
        System.out.println("radius sum: " + (radius + otherCircle.getRadius()));
        return (radius + otherCircle.getRadius()) >= distance;
    }
}
