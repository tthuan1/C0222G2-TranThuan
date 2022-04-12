package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Run {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();

        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(square);
        System.out.println("\n");


        rectangle.resize((int)(Math.random() * 99) + 1);
        System.out.println(rectangle);
        circle.resize((int)(Math.random() * 99) + 1);
        System.out.println(circle);
        square.resize((int)(Math.random() * 99) + 1);
        System.out.println(square);
    }
}
