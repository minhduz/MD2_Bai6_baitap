import Bai1.Circle;
import Bai1.Cylinder;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("------------------CIRCLE-------------------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle("green",3);
        System.out.println(circle);
        System.out.println("------------------CYLINDER-------------------");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.0);
        System.out.println(cylinder);
        cylinder = new Cylinder("yellow",2.0,6.0);
        System.out.println(cylinder);
    }
}