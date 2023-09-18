/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author Cloudy
 */
public class Bublesort {
    public static void main(String[] args) {
        int[] array = {1,2,5,3,9,4,7,6,8};
        
        bublesort(array,0,array.length-1);
        
        
         for(int j=0;j<array.length-1;j++){
             System.out.println(array[j]);
         }
    }

    private static void bublesort(int[] array, int start, int end) {
     for(int j=end;j>0;j--){
         for(int i=0;i<j;i++){
             if(array[i]>array[i+1]){
                 int temp = array[i+1];
                 array[i+1] =array[i];
                 array[i] = temp;
             }
         }
     }   
    }
}
