// Charles Oas, Oas00018, Brenen Olson, ols00175

import java.awt.Color;

public class Circle {
    
    private double xPosition;
    private double yPosition;
    private double radius;
    private Color color;

    // Constructors
    public Circle(double xPosition, double yPosition, double radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
    }
    
    // Calculations
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    
    // Setters
    public void setColor(Color color){
        this.color = color;
    }
    public void setPos(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getters
    public Color getColor() {
        return color;
    }
    public double getXPos() {
        return xPosition;
    }
    public double getYPos() {
        return yPosition;
    }
    public double getRadius() {
        return radius;
    }
}

// Written by Charles Oas, oas00018 and Brenen Olson, ols00175
