/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ReverselAlgorithm {
    
    
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("input Array Length: ");
        int arrayLength = scn.nextInt();
        int temp;
        int[] arr = new int[arrayLength];
        for(int i = 0 ; i < arrayLength ; i++){
            System.out.println((i+1) + ". element of arr ");
            temp = scn.nextInt();
            arr[i] = temp;
        }
        
        System.out.println("Left rotation number: ");
        int number = scn.nextInt();
        
        number = number % arrayLength;            
        leftRotate(arr, number, arrayLength);
        printArray(arr, arrayLength);
    }
    
    static void leftRotate(int arr[], int number , int length){
        if(number == 0){
            return;
        }
        reverseArray(arr , 0 , number-1);
        reverseArray(arr, number, length-1);
        reverseArray(arr, 0, length-1);
    }
    
    static void reverseArray(int arr[] , int start , int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    static void printArray(int arr[], int size){ 
        for (int i = 0; i < size; i++) 
            System.out.print(arr[i]); 
    } 
    
}
