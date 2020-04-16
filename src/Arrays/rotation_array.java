/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author pc
 */
public class rotation_array {
    public static void main(String[] args) {
        int[] array,rtArray;
        array = new int[5];        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println("gitmeden önce array dizisinin içi");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\n");
        rtArray = rotate(array, 4 , array.length);
        System.out.println("dönen array dizisinin içi");
        for (int i = 0; i < rtArray.length; i++) {
            System.out.print(rtArray[i]);
        }
    }
    public static int[] rotate(int ar[] , int d, int n){
        int[] rotate; 
        int j,temp;
        rotate = ar.clone();
        for(int i = 0 ; i < d; i++){
            temp = rotate[0];
            for(j = 0 ; j < rotate.length-1; j++){
                rotate[j] = rotate[j+1];
            }                    
            rotate[j] = temp;                        
        }
        
        
        return rotate;
    }
}
