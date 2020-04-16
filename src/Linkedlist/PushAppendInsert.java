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
public class PushAppendInsert {
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void push(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }
    
    public void insertAfter(Node prevNode, int value){
        if(prevNode == null){
            System.out.println("prevNode cannot be null");
            return;
        }
        
        Node new_node = new Node(value);
        new_node.next = prevNode.next;
        prevNode.next = new_node;
        
    }
    
    public void append(int value){
        Node new_node = new Node(value);
        
        if(head == null){
            head = new Node(value);
            return;
        }
        new_node.next = null;
        
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        
    }
    
    public void deleteSpecific(int value){
        Node temp = head;
        Node prev=null;
        while(temp != null){
            if(temp.data != value){
                prev = temp;
                temp = temp.next;                
            }
            else{
                prev.next = temp.next;
                temp.next = null;
                return;
                
            }
        }
        System.out.println("not found!");
    }
    
    public void deleteFirst(){
        if(head == null){
            System.out.println("empty list!!");
            
        }
        else{
            Node temp=head;
            head = temp.next;
            temp = null;
            
        }
    }
    
    public void deleteEnd(){
        if(head == null){
            System.out.println("empty list!!");
            return;
        }
        else{
            Node temp = head;
            while(temp.next.next !=null){
                temp = temp.next;                
            }
            temp.next = null;
        }
    }
    
    public void printList(){
        Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    
    public static void main(String[] args) {
        PushAppendInsert pai = new PushAppendInsert();
        pai.append(5);
        pai.push(4);
        pai.push(3);
        pai.push(1);
        pai.push(0);
        pai.push(-1);
        pai.append(6);
        pai.insertAfter(pai.head.next, 2);   
        pai.deleteSpecific(5);
        pai.printList();
    }
    
}
