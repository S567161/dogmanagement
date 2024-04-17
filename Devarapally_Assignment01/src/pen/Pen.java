package pen;

public class Pen {
    private double length;
    private double diameter;

    // Constructor to initialize attributes
    public Pen(double length, double diameter) {
        this.length = length;
        this.diameter = diameter;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter method for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to display the values of initialized attributes
    public void print() {
        System.out.println("Length: " + length);
        System.out.println("Diameter: " + diameter);
    }
}