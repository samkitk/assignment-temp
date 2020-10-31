package heap;

import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int a[] = {5,3,2,1,4,8,4,6};
        for(int i = 0;i<8;i++) arr.add(a[i]);
        MaxHeap maxH = new MaxHeap(arr);
        MinHeap minH = new MinHeap(arr);
        minH.BuildMaxHeap(arr);
        maxH.BuildMinHeap(arr);
        MaxPriorityQueue maxP = new MaxPriorityQueue(arr);
        System.out.println("max: " + maxP.ExtractMax());
        minP.IncreaseKey(0,1);
        MinPriorityQueue minP = new MinPriorityQueue(arr);
        System.out.println("min: " + minP.ExtractMin());
        maxP.Insert(1);
    }
}
