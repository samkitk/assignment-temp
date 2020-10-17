package heap;

import java.util.ArrayList;

public class MinHeap extends Heap<Integer> {

	

public MinHeap(ArrayList<Integer> arr) {
	//your code here???
	array = arr;
	heap_size = array.size();
	
}
	
public void BuildMinHeap(ArrayList<Integer> arr) {
	//your code here
    heap_size=arr.size();
    for(int i = arr.size() / 2; i >= 0; i--) MinHeapify(arr, i);
    System.out.println("Created MinHeap");
}

public void MinHeapify(ArrayList<Integer> arr, int i) {
	//your code here
    int l = Left(i);
    int r = Right(i);
    int smallest;
    if(l <= heap_size-1 && arr.get(l) < arr.get(i)) smallest = l;
    else smallest = i;
    if(r <= heap_size-1 && arr.get(r) < arr.get(smallest)) smallest = r;
    if(smallest != i)
    {
        Integer temp = arr.get(i);
        arr.set(i, arr.get(smallest));
        arr.set(smallest, temp);
        MinHeapify(arr, smallest);
    }
}

	
}
