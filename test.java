/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int a[] = {5,3,2,1,4};
        for(int i = 0;i<5;i++) arr.add(a[i]);
        MaxHeap maxH = new MaxHeap(arr);
        MinHeap minH = new MinHeap(arr);
        maxH.BuildMaxHeap(arr);
        minH.BuildMinHeap(arr);
        MaxPriorityQueue maxP = new MaxPriorityQueue(arr);
        maxP.Insert(10);
        MinPriorityQueue minP = new MinPriorityQueue(arr);
        minP.Insert(1);
    }
}
