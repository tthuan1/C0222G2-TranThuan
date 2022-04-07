package ss5_access_modifier_static_method_static_property.bai_tap.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập tên: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập lớp: ");
        student.setClasses(scanner.nextLine());

        System.out.println(student.getName());
        System.out.println(student.getClasses());

    }
}
