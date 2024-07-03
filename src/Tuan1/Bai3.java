/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

/**
 *
 * @author pc
 */
public class Bai3 {
    public static int findFirstPos(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        int firstPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                firstPos = mid;
                right = mid - 1; 
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstPos;
    }

    public static int findLastPos(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        int lastPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                lastPos = mid;
                left = mid + 1;  
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastPos;
    }
    public static void main(String[] args) {
        int a[]={5,6,7,8,8,15};
        int target=1;
        System.out.println(findFirstPos(a, target)+" , "+findLastPos(a, target));
    }
}
