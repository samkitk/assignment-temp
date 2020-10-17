
import java.util.*;

public class MaxHeap extends Heap<Integer> {

public MaxHeap(ArrayList<Integer> arr) {
	//your code here ????
	array = arr;
	heap_size = array.size();
	
}
	
public void BuildMaxHeap(ArrayList<Integer> arr) {
    //your code
    heap_size=arr.size();
    for(int i = arr.size() / 2; i >= 0; i--) MaxHeapify(arr, i);
    System.out.println("Created MaxHeap");
    
}

public void MaxHeapify(ArrayList<Integer> arr, int i) {
    //your code
    int l = Left(i);
    int r = Right(i);
    int largest;
    if(l <= heap_size-1 && arr.get(l) > arr.get(i)) largest = l;
    else largest = i;
    if(r <= heap_size-1 && arr.get(r) > arr.get(largest)) largest = r;
    if(largest != i)
    {
        Integer temp = arr.get(i);
        arr.set(i, arr.get(largest));
        arr.set(largest, temp);
        MaxHeapify(arr, largest);
    }
}



}
