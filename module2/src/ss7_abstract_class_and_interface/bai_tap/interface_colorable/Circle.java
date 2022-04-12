package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

import ss7_abstract_class_and_interface.bai_tap.interface_resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Một vòng tròn có bán kính= "
                + getRadius()
                + ", đó là một lớp con của "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius*=percent;
    }
}