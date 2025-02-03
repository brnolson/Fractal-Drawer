// Brenen Olson, ols00175, Charles Oas, oas00018

import java.awt.Color;

public class Rectangle {
    
    private double xPosTopLeft;
    private double yPosTopLeft;
    private double width;
    private double height;
    private Color color;

    // Constructors
    public Rectangle(double xPosTopLeft, double yPosTopLeft, double width, double height) {
        this.xPosTopLeft = xPosTopLeft;
        this.yPosTopLeft = yPosTopLeft;
        this.width = width;
        this.height = height;
    }

    // Calculations
    public double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }

    public double calculateArea() {
        return width * height;
    }

    // Setters
    public void setColor(Color color) {
        this.color = color;
    }

    public void setPos(double xPosTopLeft, double yPosTopLeft) {
        this.xPosTopLeft = xPosTopLeft;
        this.yPosTopLeft = yPosTopLeft;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getters
    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return xPosTopLeft;
    }

    public double getYPos() {
        return yPosTopLeft;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

// Written by: Brenen Olson, ols00175 and Charles Oas, oas00018
