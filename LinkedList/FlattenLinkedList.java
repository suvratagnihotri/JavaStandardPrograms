package com.java.StandardPrograms.LinkedList;


class Node{
    int data;
    Node next;
    Node bottom;

    Node(int data){
        this.data = data;
        this.bottom = null;
        this.next = null;
    }
}
public class FlattenLinkedList {

    public Node flatten(Node head){
        if(head == null || head.next == null){
            return head;
        }

        head.next = flatten(head.next);
        head = merge(head, head.next);
        return head;
    }

    public Node merge(Node a, Node b){
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }

        Node result = null;
        if(a.data<b.data){
            result = a;
            result.bottom = merge(a.bottom, b);
        }
        else{
            result = b;
            result.bottom = merge(a,b.bottom);
        }
        return result ;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next = new Node(28);
        head.next.next.next.bottom = new Node(35);
        head.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.bottom.bottom.bottom = new Node(45);

        FlattenLinkedList flattenLinkedList = new FlattenLinkedList();
        head = flattenLinkedList.flatten(head);  
        while(head!=null){
            System.out.println(head.data);
            head = head.bottom;
        }  

    }
}
