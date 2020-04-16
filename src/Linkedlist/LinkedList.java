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
public class LinkedList {
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
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        llist.head.next = second;
        second.next = third;
        printList(llist.head);
        
    }
    
    public static void printList(Node n){
        while(n != null){
            System.out.print(n.data);
            n = n.next;
        }
            
        
    
        
        
        
    }
}
