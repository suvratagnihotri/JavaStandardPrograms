package com.java.StandardPrograms.Stack;


public class Stack<T> {
    Node <T> top;
    int size;
    public static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data= data;
            this.next = null;
        }
    }

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data){
        Node<T> node = new Node<>(data);
        if(isEmpty()){
            this.top = node;
        }
        else{
            node.next = top;
            top = node;
            size++;
        }
    }

    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size --;
        return data;
    }

    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        else{
            return top.data;
        }
    }

    public void printStack(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        else{
            Node<T> temp = top;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public int getStackSize(){
        return this.size;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("prince");
        stack.push("suvrat");
        stack.push("agnihotri");
        stack.push("papa");
        stack.push("mummy");
        stack.push("kushik");
        stack.push("aman");
        stack.push("ashish");
        stack.push("ramdev");
        stack.push("modi");
        stack.push("mummy");
        stack.push("kushik");
        stack.push("aman");
        stack.push("ashish");
        stack.push("ramdev");
        stack.push("modi");

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("_______________________________");
        System.out.println(stack.peek());
        System.out.println("=============================");
        stack.printStack();

        System.out.println("Stack size is : "+stack.getStackSize());



    }
}
