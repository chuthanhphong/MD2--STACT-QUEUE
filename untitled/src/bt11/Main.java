package bt11;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        while (sc.hasNext()){
            String input = sc.next();
            for(int i =0;i<input.length();i++){
                char c = input.charAt(i);
                switch (c){
                    case '(':
                        stack.push(c);
                        break;
                    case '[':
                        stack.push(c);
                        break;
                    case '{':
                        stack.push(c);
                        break;
                    case ')':
                            if(stack.isEmpty() && stack.peek().equals('('))
                                stack.pop();
                            else stack.push(c);
                            break;
                    case ']':
                        if(stack.isEmpty() && stack.peek().equals('['))
                            stack.pop();
                        else stack.push(c);
                        break;
                    case '}':
                        if(stack.isEmpty() && stack.peek().equals('{'))
                            stack.pop();
                        else stack.push(c);
                        break;
                    default:
                        stack.push('x');
                        break;
                }
            }
            if(stack.isEmpty()){
                System.out.println("true");
            }
            System.out.println("False");
            stack.clear();
        }
    }
}
