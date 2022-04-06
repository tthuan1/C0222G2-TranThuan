package ss4_class_and_object_in_java.bai_tap.Fan;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on ;
    private String radius = "fan is off";
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

    }

    @Override
    public String toString() {
        if (on){
            this.setRadius("fan is Off");
            return "Fan" +
                    ", radius=" + radius +
                    ", color='" + color + '\'';
        }else {
            this.setRadius("fan is on");
            return "Fan{" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public void input(){
        int choice=-1;
        Scanner scanner= new Scanner(System.in);
        while (choice!=3){
            System.out.println("\n1. On\t2. Off\t3. Exit");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print(toString());
                    break;
                case 2:
                    this.setOn(true);
                    System.out.print(toString());
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Nhập không có trong tuỳ chọn Nhập lại đi ");
                    break;
            }
        }
    }
}
