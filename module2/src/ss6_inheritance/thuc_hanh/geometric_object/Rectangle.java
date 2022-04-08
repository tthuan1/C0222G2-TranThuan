package ss6_inheritance.thuc_hanh.geometric_object;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;

    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //    ---------------------------------------------------------------------------------------------------------------------------------------------------------
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return (getWidth() + getLength()) * 2;
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng= "+getWidth()+"\nlength="+getLength()+",\nđó là một lớp con của "+super.toString();
    }
}
