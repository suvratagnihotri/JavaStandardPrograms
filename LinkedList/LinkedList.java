package com.java.StandardPrograms.LinkedList;

import java.util.ArrayList;

public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public LinkedList insertData(LinkedList list, int data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next !=null){
                last = last.next;
            }

            last.next = newNode;
        }

        return list;
    }

    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
     
            // Go to next node 
            currNode = currNode.next; 
        } 
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); 
    
        // 
        // ******INSERTION****** 
        // 
    
        // Insert the values 
        list = list.insertData(list, 1); 
        list = list.insertData(list, 2); 
        list = list.insertData(list, 3); 
        list = list.insertData(list, 4); 
        list = list.insertData(list, 5); 
        list = list.insertData(list, 6); 
        list = list.insertData(list, 7); 
        list = list.insertData(list, 8); 
    
        // Print the LinkedList 
        printList(list);
        ArrayList <Integer> arrayList = new ArrayList<>();

        while(list.head !=null){
            arrayList.add(list.head.data);
            list.head = list.head.next;
        }

        System.out.println("Middle element is :"+ arrayList.get(arrayList.size()/2));
    }
}
