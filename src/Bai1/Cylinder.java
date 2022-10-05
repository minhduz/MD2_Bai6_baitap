package Bai1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*getHeight();
    }

    public String toString(){
        return "A cylinder with color = "
                + getColor()
                + ", radius = "
                + getRadius()
                + " and height = "
                + getHeight()
                + " have volume = "
                + getVolume()
                + " ,which subclass of "
                + super.toString();
    }
}
