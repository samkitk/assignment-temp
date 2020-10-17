package heap;

import java.util.*;

public class MinHeap extends Heap<Integer> {

	

public MinHeap(ArrayList<Integer> arr) {
    //your code here???
	array = arr;
	heap_size = array.size();
	
}
	
public void BuildMinHeap(ArrayList<Integer> arr) {
	//your code here
    for(int i = arr.size() / 2; i > 0; i--) MinHeapify(arr, i);
}

public void MinHeapify(ArrayList<Integer> arr, int i) {
	//your code here
        int l = Left(i);
        int r= Right(i);
        int smallest=0;
        Integer a = arr.get(l);
        Integer b= arr.get(i);
        if(l <= heap_size && ((a.compareTo(b)) < 0)){
            smallest = l;
        } else{
            smallest = i;
        } if(r <= heap_size && (arr.get(l).compareTo(arr.get(smallest)) > 0)){
        }
        if(smallest != i)
        {
            Integer temp = b;
            arr.set(i, arr.get(smallest));
            arr.set(smallest, temp);
            MinHeapify(arr, smallest);
        }
}

	
}
