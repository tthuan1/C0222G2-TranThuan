package s11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        Stack<Integer> myStack1=new Stack<>();
        Scanner scanner=new Scanner(System.in);
//
        System.out.print("Nhập số phần tử: ");
        int size=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= size; i++) {
            System.out.print("Nhập phần tử thứ "+i+": ");
            int e=Integer.parseInt(scanner.nextLine());
            myStack.push(e);
        }
        for (int i = 1; i <= size; i++) {
            myStack1.push(myStack.pop());
        }

        for (int i = 1; i <=size; i++) {
            System.out.println("phần tử thứ "+i+": "+myStack1.search(i));
        }
//        ------------------------------------------------------------------------------------------------------------------------
//        Stack<String> mWord=new Stack<>();
//        Stack<String> wStack=new Stack<>();
//        System.out.println("Nhập chữ đi: ");
//        String str=scanner.nextLine();
////
//        String[] words = str.split("");
//
//
//        for (int i = 1; i < words.length; i++) {
//            wStack.push(words[i]);
//        }
//        for (String c:wStack) {
//            System.out.println(wStack.search(c));
//        }


        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
//        for (String w : wStack) {
//            System.out.print(w);
//        }
//        for (int i = 1; i <= wStack.size(); i++) {
//            System.out.println(wStack.search(i));
//        }




    }
}

