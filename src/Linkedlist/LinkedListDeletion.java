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
public class LinkedListDeletion {
    Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public static void main(String[] args) {
        LinkedListDeletion lld = new LinkedListDeletion();
        
        lld.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        
        lld.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        printList(lld.head); // print list before deletion
        deletion(second);    // delete the element after the given parameter
        printList(lld.head); // print list after deletion
        
    }
    
    public static void printList(Node n){
        while(n != null){
            System.out.print(n.data);
            n = n.next;
        }
    }
    
    public static void deletion(Node prevNode){
        prevNode.next = prevNode.next.next;
        prevNode.next.next = null; 
        
    }
    
    
    
}
