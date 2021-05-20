package bt3;

import java.util.Stack;

;

public class MyGenericStack<number> {
    public static void main(String[] args) {
//        Stack<Integer> wstack;
//        wstack = new Stack<>();
//        wstack.push(1);
//        wstack.push(2);
//        wstack.push(3);
//        wstack.push(4);
//        wstack.push(5);
//        System.out.println("Before");
//
    Stack<String> stack2 = new Stack<>();

    String str = "A Chương là trộm chó đi exciter";
       String[] a = str.split(" ");
       for(int i =0;i<a.length;i++) {
           stack2.push(a[i]);
       }
        System.out.println(stack2);
        System.out.println("after");
        while (!stack2.empty()){
            System.out.print(stack2.pop() + ".");
        }
//        stack2.push(a);
//        System.out.println(stack2);
//        for(Integer integer :wstack){
//            System.out.println(integer);
//        }
//        System.out.println("after");
//while (!wstack.isEmpty()){
//    System.out.println(wstack.pop());
//}




}}
