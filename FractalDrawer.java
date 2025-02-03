// Brenen Olson, ols00175, Charles Oas, oas00018

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

public class FractalDrawer {
    private static double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor

    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public static double drawFractal(String type) {

        // Create Canvas for shape drawing
        Canvas drawing = new Canvas(800,800);
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        
        // Random Color Selector for shapes
        Color newColor = Color.BLUE;

        if (randNum == 1) {
            newColor = Color.GREEN;
        } else if (randNum == 2) {
            newColor = Color.RED;
        }

        // User input to determine shape of fractals
        if (type.equals("c")) { // Create circle fractal when "c" is pressed
            drawCircleFractal(200, 400, 400, newColor, drawing, 6);
        } else if (type.equals("t")) { // Create triangle fractal when "t" is pressed
            drawTriangleFractal(200, 200, 300, 500, newColor, drawing, 6);
        } else if (type.equals("r")) { // Create rectangle fractal when "r" is pressed
            drawRectangleFractal(200, 200, 250, 300, newColor, drawing, 6);
        }

        return totalArea;
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public static void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level == 0) {

            // Base Case

            // Random Color Selector for shapes
            Random rand = new Random();
            int randNum = rand.nextInt(3);
            Color newColor = Color.BLUE;

            if (randNum == 1) {
                newColor = Color.GREEN;
            } else if (randNum == 2) {
                newColor = Color.RED;
            }

            // Create Triangle
            Triangle tri = new Triangle(x, y, width, height);
            tri.setColor(newColor);
            can.drawShape(tri);

            // Add to total area
            totalArea += tri.calculateArea();

        } else {

            // Process

            // Random Color Selector for shapes
            Random rand = new Random();
            int randNum = rand.nextInt(3);
            Color newColor = Color.BLUE;

            if (randNum == 1) {
                newColor = Color.GREEN;
            } else if (randNum == 2) {
                newColor = Color.RED;
            }

            // Create Triangle
            Triangle tri = new Triangle(x, y, width, height);
            tri.setColor(newColor);
            can.drawShape(tri);

            // Add to total Area
            totalArea += tri.calculateArea();

            //Recursive Calls
            drawTriangleFractal(width / 2, height / 2, x - (width / 2), y, newColor, can, level - 1); // Left Triangle
            drawTriangleFractal(width / 2, height / 2, x + (width / 2) - (width / 4), y - height, newColor, can, level - 1); // Top Triangle
            drawTriangleFractal(width / 2, height / 2, x + (width), y, newColor, can, level - 1); // Right Triangle
        }
    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public static void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level == 0) {

            // Base Case

            // Random Color Selector for shapes
            Random rand = new Random();
            int randNum = rand.nextInt(3);
            Color newColor = Color.BLUE;

            if (randNum == 1) {
                newColor = Color.GREEN;
            } else if (randNum == 2) {
            newColor = Color.RED;
            }

            // Create Circle
            Circle cir = new Circle(x, y, radius);
            cir.setColor(newColor);
            can.drawShape(cir);

            // Add to total Area
            totalArea += cir.calculateArea();

        } else {
            
            // Process

            // Random Color Selector for shapes
            Random rand = new Random();
            int randNum = rand.nextInt(3);
            Color newColor = Color.BLUE;

            if (randNum == 1) {
                newColor = Color.GREEN;
            } else if (randNum == 2) {
                newColor = Color.RED;
            }

            // Create Circle
            Circle cir = new Circle(x, y, radius);
            cir.setColor(newColor);
            can.drawShape(cir);

            // Add to total Area
            totalArea += cir.calculateArea();

            // Recursive Calls
            drawCircleFractal(radius / 2, x - radius, y - radius, newColor, can, level - 1); // Bottom Left Circle
            drawCircleFractal(radius / 2, x - radius, y + radius, newColor, can, level - 1); // Top Left Circle
            drawCircleFractal(radius / 2, x + radius, y + radius, newColor, can, level - 1); // Top Right Circle
            drawCircleFractal(radius / 2, x + radius, y - radius, newColor, can, level - 1); // Bottom Right Circle
        }
    }

    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public static void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level == 0) {

            // Base Case

            // Random Color Selector for shapes
            Random rand = new Random();
            int randNum = rand.nextInt(3);
            Color newColor = Color.BLUE;

            if (randNum == 1) {
                newColor = Color.GREEN;
            } else if (randNum == 2) {
            newColor = Color.RED;
            }

            // Create Rectangle
            Rectangle rect = new Rectangle(x, y, width, height);
            rect.setColor(newColor);
            can.drawShape(rect);

            // Add to total Area
            totalArea += rect.calculateArea();

        } else {
            
            // Process

            // Random Color Selector for shapes
            Random rand = new Random();
            int randNum = rand.nextInt(3);
            Color newColor = Color.BLUE;

            if (randNum == 1) {
                newColor = Color.GREEN;
            } else if (randNum == 2) {
                newColor = Color.RED;
            }

            // Create Rectangle
            Rectangle rect = new Rectangle(x, y, width, height);
            rect.setColor(newColor);
            can.drawShape(rect);

            // Add to total Area
            totalArea += rect.calculateArea();

            // Recursive Calls
            drawRectangleFractal(width / 2, height / 2, x + (width / 4), y + height, newColor, can, level - 1); // Bottom Rectangle
            drawRectangleFractal(width / 2, height / 2, x - (width / 2), y + (width / 4), newColor, can, level - 1); // Left Rectangle
            drawRectangleFractal(width / 2, height / 2, x + (width / 4), y - (height / 2), newColor, can, level - 1); // Top Rectangle
            drawRectangleFractal(width / 2, height / 2, x + width, y + (height / 4), newColor, can, level - 1); // Right Rectangle
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args) {
        
        // Prompt user to select shape of fractals to be created
        System.out.println("Choose circle \"c\", triangle \"t\", rectangle \"r\"");
        Scanner myScan = new Scanner(System.in);
        String inp = myScan.nextLine();

        // Draw the selected fractal and print the total area
        FractalDrawer fractalDrawer = new FractalDrawer();
        double area = fractalDrawer.drawFractal(inp);
        System.out.println("Area of the fractal: " + area);
    }
}

// Written by: Brenen Olson, ols00175 and Charles Oas, oas00018
