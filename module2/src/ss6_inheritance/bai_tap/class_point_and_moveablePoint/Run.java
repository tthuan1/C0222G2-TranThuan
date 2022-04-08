package ss6_inheritance.bai_tap.class_point_and_moveablePoint;

public class Run {
    public static void main(String[] args) {
        Point point=new Point();
        MoveablePoint moveablePoint=new MoveablePoint();
        moveablePoint.setSpeed(1,2);

        for (float i:moveablePoint.getSpeed()) {
            System.out.println(moveablePoint.getSpeed()[(int)i-1]);
        }

        System.out.println(point.toString());
    }
}
