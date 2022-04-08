package ss6_inheritance.bai_tap.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height = 2;

    //--------------------------------------------------------------------------------------------------------------
    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    //--------------------------------------------------------------------------------------------------------------
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //--------------------------------------------------------------------------------------------------------------

    public double areaXQ() {
        return super.perimeter()*height ;
    }
    public double areaTP(){
        return areaXQ()+2*super.area();
    }

    @Override
    public String toString() {
        return "\nHình trụ có: bán kính "+super.getRadius()+"\tchiều cao: "+height+"\tcó màu là: "+super.getColor()+
                "\nDiện tích xung quanh hình trụ: "+areaXQ()+
                "\nDiện tích toàn phần: "+areaTP();
    }
}
