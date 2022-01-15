package com.company;

import com.sun.jdi.IntegerValue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Practice {

    public static void main(String[] args) {
//        ArrayList<Integer> list1D = new ArrayList<Integer>(10);
//        list1D.add(10);
//        list1D.add(20);
//        list1D.add(30);
//        list1D.add(40);
//        list1D.add(50);
//        System.out.println(list1D);
//        list1D.remove(2);
//        System.out.println(list1D);
//        for (int i = 0; i < list1D.size() ; i++) {
//            System.out.print(list1D.get(i) + " ");
//        }
//        ArrayList<Integer> list = new ArrayList<Integer>(10);
//       Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int i = 0; i <n ; i++) {
//            System.out.print(list.get(i) + " ");
//
//        }
        //Initialising Arraylists with other arraylists
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2D.get(i).add(sc.nextInt());
            }
        }
        //adding elements
        System.out.println(list2D);
    }
}
