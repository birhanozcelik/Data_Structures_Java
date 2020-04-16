/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author pc
 */
public class LinkedListInsert {
    Node head;   
    static class Node{ // Simple Node class
        int data;
        Node next;
        
        Node(int d){  // Node const
            data = d;
            next = null;
        }
    }
    
    
    public static void main(String[] args) {
        Node newHead;
        LinkedListInsert lli = new LinkedListInsert();
        lli.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        
        lli.head.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = null;
        printList(lli.head); //print list before adding
        newHead = insertFront(lli.head,0); // add 0
        newHead = insertFront(newHead,-1); // add -1
        insertAfter(third, 8);
        append(five, 6);
        printList(newHead);  //print list after adding
        
    }
    
    public static void printList(Node n){  //print list method
        while(n != null){
            System.out.print(n.data);
            n = n.next;
        }        
    }
    public static Node insertFront(Node head,int value){  // at the front of the linked list 
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
        return head;
    }
    
    public static void insertAfter(Node prevNode, int value){
        if(prevNode == null){
            System.out.println("Prev node cannot be null");
            return;
        }
        Node new_node = new Node(value);
        new_node.next = prevNode.next;
        prevNode.next = new_node;
    }
    
    public static void append(Node end,int value){
        Node new_node = new Node(6);
        new_node.next = null;
        end.next = new_node;        
    }
    
}
