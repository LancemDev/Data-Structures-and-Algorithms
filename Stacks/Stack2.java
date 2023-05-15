package Stacks;

import java.util.Scanner;

public class Stack2 {
    int number[];
    int top;
    int limit;
    //Constructor
    public Stack2(int size) {
        number = new int[size];
        top = -1;
        limit = size;
    }

    //Insert an element into the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        number[++top] = x;
    }
    //Popping an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return number[top--];
    }
    //Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    //Check if the stack is full
    public boolean isFull() {
        return top == limit - 1;
    }
    //Return the size of the stack
    public int size() {
        return top + 1;
    }
    //Print the stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(number[i]);
        }
    }
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = sc.nextInt();
        Stack2 stack = new Stack2(size);
        System.out.println("Enter the elements of the stack");
        for (int i = 0; i < size; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("The elements of the stack are:");
        stack.printStack();
        System.out.println("The size of the stack is " + stack.size());
        System.out.println("The element popped from the stack is " + stack.pop());
        System.out.println("The size of the stack is " + stack.size());
        sc.close();
    }
}
