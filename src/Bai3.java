import Bai3.Point;
import Bai3.MovablePoint;

public class Bai3 {
    public static void main(String[] args) {
    Point point = new Point();
    System.out.println(point);
    point = new Point(4.3f,5.6f);
    System.out.println(point);


    MovablePoint movablePoint = new MovablePoint(3.4f,6.5f);
    System.out.println(movablePoint);
    movablePoint.move();
    System.out.println(movablePoint);
    movablePoint = new MovablePoint(2.0f,3.0f,4.0f,5.0f);
    System.out.println(movablePoint);
    movablePoint.move();
    System.out.println(movablePoint);



    }
}
