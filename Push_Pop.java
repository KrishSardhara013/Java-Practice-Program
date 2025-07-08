//Write a program to implement push and pop operations

import java.util.Scanner;
import java.util.Stack;

public class Push_Pop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Stack Sized:");
        int n = in.nextInt();
        System.out.println("Pushed element in the stack :");
        for(int i=0;i<n;i++)
        {
            stack.push(in.nextInt());
        }
        System.out.println("Stack after pushing:"+stack);
        System.out.println("\nPoping element:");
        while (!stack.isEmpty()) {
            System.out.println("Poped element is " +stack.pop());
        }
        System.out.println("\nStack after Poping"+stack);

        in.close();
    }
}
