/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode;

/**
 *
 * @author Cloudy
 */
public class Leetcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1000,100,0,1,1000,1};
        int count =1;
        int max =0;
        for(int i=0;i<a.length;i++){
            
            int x = a[i];
            while(x/10!=0){
                count++;
                x=x/10;
            }
            if(count%2==0){
                max++;
            }
            System.out.println(max);
            count =1;
            }
        
        System.out.println(max);
    }
    
}
