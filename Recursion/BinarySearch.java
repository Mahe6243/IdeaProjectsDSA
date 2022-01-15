package com.company;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value to be searched");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int res = binarySearch(arr,target,start,end);
        System.out.println(res);
    }
    public static int binarySearch(int[] arr,int target,int start,int end){

        if(start > end){
            return -1;

        }
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,target,start,(mid-1));
        }
        return binarySearch(arr,target,(mid+1),end);
    }
}
