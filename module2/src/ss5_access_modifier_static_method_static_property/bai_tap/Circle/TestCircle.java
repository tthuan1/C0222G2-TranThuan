package ss5_access_modifier_static_method_static_property.bai_tap.Circle;

public class TestCircle {
    private double radius=1;
    private String color="red";
    final double PI=3.14;

    private double getArea(){
        return (this.radius*this.radius*PI);
    }
    public double getArea1(){
        return (this.radius*this.radius*PI);
    }

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


}
