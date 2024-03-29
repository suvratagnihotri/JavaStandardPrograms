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

    public static void printList(Node list) 
    { 
        Node currNode = list; 
     
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
    public LinkedList.Node removeLoop(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        boolean hasLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        if (hasLoop) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            // At this point, slow and fast are both at the start of the loop
            // We can now move the fast pointer to the last node in the loop
            while (fast.next != slow) {
                fast = fast.next;
            }
            // Set the next node of the last node in the loop to null
            fast.next = null;
        }
        return slow;
    }
    public void printNthFromEnd(int n, Node head) {
        Node p1 = head;
        Node p2 = head;
        
        for(int i=0; i<n; i++) {
            if(p1 == null) {
                System.out.println("List is shorter than " + n + " nodes");
                return;
            }
            p1 = p1.next;
        }
        
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        System.out.println("Nth node from end is: " + p2.data);
    }

    public int isPalindrome(Node head){
        int number = 0;
        int temp = 0;
        int newNumber = 0;
        if(head==null){
            return 0;
        }
        else if(head.next==null){
            return 1;
        }
        else{
            while(head!=null){
                number = number*10+head.data;
                head = head.next;
            }
            temp = number;
            while(number>0){
                newNumber = newNumber*10 +number%10;
                number = number/10;
            }
            if(newNumber == temp){
                return 1;
            }
        }
        return 0;
    }

    public Node getIntersectionNode(Node head1, Node head2)
    {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                // if both Nodes are same
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        // If intersection is not present between the lists,
        // return NULL.
        return null;
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); 
    
        // 
        // ******INSERTION****** 
        // 
    
        // Insert the values 
        list = list.insertData(list, 1); 
        list = list.insertData(list, 2); 
        list = list.insertData(list, 1); 
        // list = list.insertData(list, 3); 
        // list = list.insertData(list, 4); 
        // list = list.insertData(list, 5); 
        // list = list.insertData(list, 6); 
        // list = list.insertData(list, 7); 
        // list = list.insertData(list, 8); 
        // list = list.insertData(list, 8); 
        // list = list.insertData(list, 9); 
        // list = list.insertData(list, 10); 
        // list = list.insertData(list, 23); 
        // list = list.insertData(list, 24); 

        LinkedList list2 = new LinkedList();

        list2 = list2.insertData(list2, 1); 
        list2 = list2.insertData(list2, 2); 
        list2 = list2.insertData(list2, 1); 
    
        // Print the LinkedList 
        // printList(list);
        

        // System.out.println("Middle element is :"+ new LinkedList().middleElementOfList(list));
        // printList(new LinkedList().removeLoop(list.head));
        // System.out.println(new LinkedList().isPalindrome(list.head));
        Node intersectionNode = new LinkedList().getIntersectionNode(list.head, list2.head);

        if(intersectionNode==null){
            System.out.println("No intersection node.");
        }
        else{
            System.out.println("Intersection Node found");
        }

    }
}
