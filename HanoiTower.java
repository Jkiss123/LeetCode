/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.util.Stack;

/**
 *
 * @author Cloudy
 * 
 */



    
public class HanoiTower {
    
    public static void move(int x ,String from, String to){
        System.out.println(x+" Moved from:"+from+" To:"+to);
}

public static void hanoi(int x, String from,String mid , String to){
    if(x==1){
        move(x,from,to);
    }else{
        hanoi(x-1,from,to,mid);
        move(x,from,to);
        hanoi(x-1,mid,from,to);
                }
}
    

    
    public static void main(String[] args) {
        Stack<Integer> a = new Stack();
        Stack<Integer> b = new Stack();
        Stack<Integer> c = new Stack();
        int x=3;
        for(int i=3;i>0;i--){
            a.push(i);
        }
        System.out.println(a);
        
        hanoi(8,"A","B","C");
    }
    
}
