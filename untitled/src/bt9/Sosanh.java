package bt9;

import java.util.Scanner;
import java.util.Stack;

public class Sosanh {
    public static void main(String[] args) {
        System.out.println("Nhập 1 chuỗi bạn muốn kiểm tra");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reseverString = "";
        while (!stack.isEmpty()) {
            reseverString = reseverString + stack.pop();
        }
        if (inputString.equals(reseverString)) {
            System.out.println("Đây là chuỗi đối xứng");
        }else System.out.println("Đây không phải chuỗi đối xứng");

    }


}

