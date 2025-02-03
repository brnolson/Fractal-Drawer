// Charles Oas, oas00018, Brenen Olson, ols00175

import java.awt.Color;

public class Triangle {
    
    private double xPosBottomLeft;
    private double yPosBottomLeft;
    private double width;
    private double height;
    private Color color;

    // Constructors
    public Triangle(double xPosBottomLeft, double yPosBottomLeft, double width, double height) {
        this.xPosBottomLeft = xPosBottomLeft;
        this.yPosBottomLeft = yPosBottomLeft;
        this.width = width;
        this.height = height;
    }
    
    // Calculations
    public double calculatePerimeter() {
        return width * 3; // might need to change the math on this
    }

    public double calculateArea() {
        return width * height;
    }
    
    // Setters
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double xPosBottomLeft, double yPosBottomLeft) {
        this.xPosBottomLeft = xPosBottomLeft;
        this.yPosBottomLeft = yPosBottomLeft;
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
        return xPosBottomLeft;
    }
    public double getYPos() {
        return yPosBottomLeft;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }  
}   

// Written by Charles Oas, Oas00018 and Brenen Olson, ols00175
