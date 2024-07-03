/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pc
 */
public class Bai1 {
    public static boolean binarySearch(int a[],int x){
        int left=0,right=a.length-1;
        while(left<=right){
           int mid=left+(right-left)/2;
           if(a[mid]==x){
               return true;
           }
           else if(a[mid]<x)
               left=mid+1;
           else right=mid-1;
        }
        return false;
    }
    public static Set<Integer> intersection(int a[],int b[]){
        Set<Integer> res=new HashSet<>();
        for(int x:a){
            if(binarySearch(b, x))
                res.add(x);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,6,6,7};
        int b[]={1,2,3,4,5,6,7,8};
        System.out.println(intersection(a, b));
    }
}
