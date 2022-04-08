package ss6_inheritance.thuc_hanh.geometric_object;

public class Circle extends Shape {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
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
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Một vòng tròn có bán kính="
                + getRadius()
                + "\nđó là một lớp con của "
                + super.toString()+"\n";
    }
}
