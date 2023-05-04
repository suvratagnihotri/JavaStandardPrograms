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

    public int middleElementOfList(LinkedList list){
        if(list.head==null){
            return 0;
        }
        else{
            ArrayList <Integer> arrayList = new ArrayList<>();

            while(list.head !=null){
                arrayList.add(list.head.data);
                list.head = list.head.next;
            }
            return arrayList.get(arrayList.size()/2);
        }
    }

    public LinkedList reverseLinkedList(LinkedList list){
        LinkedList newList = new LinkedList();

        if(list.head == null){
            return null;
        }
        else{
            ArrayList<Integer> arrayList = new ArrayList<>();
            while(list.head!=null){
                arrayList.add(list.head.data);
                list.head = list.head.next;
            }
            for(int i = arrayList.size()-1; i>=0; i--){
                newList = newList.insertData(newList, arrayList.get(i));
            }
        }
        return newList;
    }

    public LinkedList rotateList(LinkedList list,int rotation){
        LinkedList newList = new LinkedList();
        if(list.head==null){
            return null;
        }
        else{
            ArrayList <Integer> arrayList = new ArrayList<>();
            while(list.head!=null){
                arrayList.add(list.head.data);
                list.head = list.head.next;
            }

            for(int i = rotation; i<arrayList.size(); i++){
                newList = newList.insertData(newList, arrayList.get(i)); 
            }

            for(int i = 0; i<rotation; i++){
                newList = newList.insertData(newList, arrayList.get(i)); 
            }

        }
        return newList;
    }

    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                return true;
            }
        }
    
        return false;
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
        list = list.insertData(list, 8); 
        list = list.insertData(list, 9); 
        list = list.insertData(list, 10); 
        list = list.insertData(list, 23); 
        list = list.insertData(list, 24); 


    
        // Print the LinkedList 
        // printList(list);
        

        // System.out.println("Middle element is :"+ new LinkedList().middleElementOfList(list));
        // printList(new LinkedList().rotateList(list, 3));
        System.out.println(new LinkedList().detectLoop(list.head));

    }
}
