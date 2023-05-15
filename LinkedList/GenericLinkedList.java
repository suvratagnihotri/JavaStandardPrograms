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

    public static void main(String[] args) {
        GenericLinkedList<String> genericLinkedList = new GenericLinkedList<>();

        Node<String> node = genericLinkedList.node = new Node<String>("Value_1");
        node.next = new Node<String>("Value_2");
        node.next.next = new Node<String>("Value_3");
        node.next.next.next = new Node<String>("Value_4");
        node.next.next.next.next = new Node<String>("Value_5");
        node.next.next.next.next.next = new Node<String>("Value_6");
        genericLinkedList.printLinkedList(node);
    }
}
