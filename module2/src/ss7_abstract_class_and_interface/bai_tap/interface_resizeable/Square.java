package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double edge =1.0;
    public Square(){};
    public Square(double edge){
        this.edge=edge;
    }public Square(double edge,String color,boolean filled){
        super(color,filled);
        this.edge=edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return edge*edge;
    }
    public double getPerimeter(){
        return 4*edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                "Area= "+getArea()+
                "Perimeter= "+getPerimeter()+
                '}';
    }


    @Override
    public void resize(double percent) {
        edge*=percent;
    }
}



