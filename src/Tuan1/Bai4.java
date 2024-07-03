/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.Arrays;

/**
 *
 * @author pc
 */
public class Bai4 {
    public static int [] countingSortPrefixSum(int a[])
    {
        int max=0;
        for (int i = 0; i < a.length; i++) {
            max=Math.max(max, a[i]);
        }
        int countingA[]=new int [max+1];
        for (int i = 0; i < a.length; i++) {
            countingA[a[i]]++;
        }
        for(int i=1;i<=max;i++)
        {
            countingA[i]+=countingA[i-1];
        }
        int outputA[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            outputA[countingA[a[i]]-1]=a[i];
            countingA[a[i]]--;
        }
        return outputA;
    }
    public static void main(String[] args) {
        int a[]={0,0,1,2,2,3,4,5,5,7};
        int outputA[]=countingSortPrefixSum(a);
        for (int i = 0; i < outputA.length; i++) {
            System.out.print(outputA[i]+" ");
        }
    }
    
}
