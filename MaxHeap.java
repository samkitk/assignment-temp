package heap;

import java.util.*;

public class MaxHeap extends Heap<Integer>{

public MaxHeap(ArrayList<Integer> arr) {
	//your code here ???
	array = arr;
	heap_size = array.size();
	
}
	
public void BuildMaxHeap(ArrayList<Integer> arr) {
	//your code
    for(int i = arr.size() / 2; i > 0; i--) MaxHeapify(arr, i);
}

public void MaxHeapify(ArrayList<Integer> arr, int i) {
	int l = Left(i);
        int r= Right(i);
        int largest=0;
        Integer a = arr.get(l);
        Integer b= arr.get(i);
        if(l <= heap_size && ((a.compareTo(b)) > 0)){
            largest = l;
        } else{
            largest = i;
        } if(r <= heap_size && (arr.get(l).compareTo(arr.get(largest)) > 0)){
        }
        if(largest != i)
        {
            Integer temp = b;
            arr.set(i, arr.get(largest));
            arr.set(largest, temp);
            MaxHeapify(arr, largest);
        }
    }

}