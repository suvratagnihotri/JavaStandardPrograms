package com.java.StandardPrograms.LinkedList;


public class GenericLinkedList<T> {

    Node<T> node;
    Node<T>next ;
    public GenericLinkedList(){
        this.node = null;
        this.next = null;
    }

    private static class Node<T>{
        Node<T> next;
        T data;

        public Node(T data){
            this.data =data;
            this.next = null;
        }
    }

    public void printLinkedList(Node<T> head){
        if(head == null){
            throw new RuntimeException("Linked list is empty.");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    public Node insertData(Node<T> head, T data){
        Node<T> tempNode = new Node<>(data);
        if(head == null){
            throw new RuntimeException("Linked list ins empty.");
        }
        else if(head.next == null){
            head.next = tempNode;
            return head;
        }
        else{
            Node<T> temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = tempNode;
        }
        return head;
    }

    public static void main(String[] args) {
        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();

        Node<Integer> node = genericLinkedList.node = new Node<Integer>(1);


    }
}
