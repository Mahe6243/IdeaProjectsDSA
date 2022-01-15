package com.company;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements in either Ascending or Descending order:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value to be SEARCHED in the given array:");
        int target = sc.nextInt();
        int index = orderAgnosticBinarySearch(arr,target);
        System.out.println("The index of target value in the given array is " + index);
        System.out.println("If the index value is -1 then the element is not present in the given array");
    }
    public static int orderAgnosticBinarySearch(int[] arr,int target){
        int start = 0;//starting index of array
        int end = arr.length - 1;//ending or last index of the array

        //finding the middle index of the array
        //int mid = (start + end) / 2;
        // this condition may fail because the start and end might be very large numbers
        //and while adding them the resultant may exceed the range of integer value that
        // can an int data type can store
        //So the alternative is
        while (start <= end) {
            //find whether the given array is in ascending or descending order
            boolean isAsc = arr[start] < arr[end];
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }



        }
        return -1;

    }
}
