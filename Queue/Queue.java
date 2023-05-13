package com.java.StandardPrograms.Queue;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    
    private static class Node<T> {
        private T data;
        private Node<T> next;
        
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public void printQueue(Queue<T> queue){
        while(queue.isEmpty()==false){
            System.out.println(queue.peek());
            queue.dequeue();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(611);
        queue.enqueue(621);
        queue.enqueue(634);

        queue.printQueue(queue);

    }
}

