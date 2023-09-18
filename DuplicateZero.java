/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author Cloudy
 */
public class DuplicateZero {
    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,4,5,0};
        int n = a.length;
        
        
        for(int j=0;j<n-1;j++){
            if(a[j]==0){
       for(int i=n-1;i>j;i--){
           a[i]=a[i-1];
           System.out.print(a[i]);
       }
       
        j++;
        }
        }
        System.out.println("A sau khi sort");
        for(int x : a){
            System.out.println(x);
        }
    }
    
    
}
