package ss6_inheritance.bai_tap.class_point2D_and_class_point3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        point3D.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println(point3D.toString());
        for (float i : point3D.getXYZ()) {
            System.out.println("Phần tử thứ "+((int) i - 1)+"\t"+point3D.getXYZ()[(int) i - 1]);
        }
        System.out.println(point2D.toString());
    }
}
