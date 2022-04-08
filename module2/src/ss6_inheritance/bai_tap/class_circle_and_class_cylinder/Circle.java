package ss6_inheritance.bai_tap.class_circle_and_class_cylinder;

public class Circle {
    private double radius = 2;
    private String color = "blue";
//Tạo method không có đối số------------------------------------------------------------------------------------------------------------------------------

    public Circle() {
    }

    //Tạo method có đối số radius và color------------------------------------------------------------------------------------------------------------------------------
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // tạo getter và setter cho thuộc tính radius và thuộc tính color ------------------------------------------------------------------------------------------------------------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //  ------------------------------------------------------------------------------------------------------------------------------
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Hình tròn có: màu " + getColor() + "\tbán kính " + getRadius() + "\tcó diện tích là: " + area();
    }
}
