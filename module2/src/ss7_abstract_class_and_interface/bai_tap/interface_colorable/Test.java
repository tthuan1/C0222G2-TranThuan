package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Square square=new Square();
//        System.out.println(square);
//        square.howToColor();
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        shapes[2]=new Square();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square){
                square.howToColor();
            }
        }

    }
}
