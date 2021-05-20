package bt8;

import java.util.Scanner;
import java.util.Stack;

public class Chuyendoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số");
        int a = sc.nextInt();
        System.out.println("Trước khi chuyển" + a);
        System.out.println("sau khi chuyển");
        while (a!=0){
            int result = a%2;
            a =a/2;
            stack.push(result);
            System.out.println(stack);
        }
        while (!stack.isEmpty()){
            System.out.print("  " +stack.pop());
        }
    }




}
