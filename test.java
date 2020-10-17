/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

public class test {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int a[] = {7,3,2,6,3,9,5,6};

        for(int i = 0;i<8;i++) 
        {
            arr.add(a[i]);
        }

        MaxHeap maxH = new MaxHeap(arr);
        MinHeap minH = new MinHeap(arr);
        
        maxH.BuildMaxHeap(arr);
        minH.BuildMinHeap(arr);
        
        MaxPriorityQueue maxP = new MaxPriorityQueue(arr);
        System.out.println("min: " + maxP.ExtractMax());
        maxP.IncreaseKey(0,1);
        
        MinPriorityQueue minP = new MinPriorityQueue(arr);
        System.out.println("max: " + minP.ExtractMin());
        minP.Insert(1);
    }
}