package Bai1;

public class Circle {
    private String color = "red";
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(getRadius(),2)*Math.PI;
    }

    public String toString(){
        return "Cirle with color = "
                + getColor()
                + " and radius = "
                + getRadius()
                + " have Area = "
                + getArea();
    }
}
