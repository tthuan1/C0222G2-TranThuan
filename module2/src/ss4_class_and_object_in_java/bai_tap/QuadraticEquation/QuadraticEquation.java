package ss4_class_and_object_in_java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    Scanner scanner = new Scanner(System.in);


    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }


    public void getRoot() {
        System.out.printf("Dalta= " + getDiscriminant());
        System.out.printf("\nPhương trình: " + this.a + "^2 + " + this.b + "x + x =0\n");
        if (getDiscriminant() > 0) {
            System.out.printf("Phương trình có 2 nghiệm: \nx1= " + getRoot1() + "\nx2= " + getRoot2());

        } else if (getDiscriminant() == 0) {
            System.out.printf("Phương trình có 2 nghiệm kép: x1= x2= " + getRoot1());
        } else {
            System.out.printf("Phương trình vô nghiệm");

        }
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public void input() {
        System.out.printf("Nhập a: ");
        this.setA(Double.parseDouble(scanner.nextLine()));
        System.out.printf("Nhập b: ");
        this.setB(Double.parseDouble(scanner.nextLine()));
        System.out.printf("Nhập c: ");
        this.setC(Double.parseDouble(scanner.nextLine()));
    }


}
