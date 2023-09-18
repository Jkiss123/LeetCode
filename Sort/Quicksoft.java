/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author Cloudy
 */
public class Quicksoft {
    public static void main(String[] args) {
        int[] array = {1,2,5,3,9,4,7,6,8};
        
         quickSort(array,0,array.length-1);
         
         for(int j=0;j<array.length-1;j++){
             System.out.println(array[j]);
         }
    }

    private static void quickSort(int[] array, int start, int end) {
       if(end <= start) return;
       int pivot = partition(array,start,end);
       quickSort(array,start,pivot-1);
       quickSort(array,pivot+1,end);
    }
    
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i =start-1;
        for(int j =start;j<end;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
        return i;
    }

    	
    
            
}
