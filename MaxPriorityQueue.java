package heap;

import java.util.*;
import java.lang.*;

public class MaxPriorityQueue extends MaxHeap implements MaxPriorityQueueIN<Integer> {

	public MaxPriorityQueue(ArrayList<Integer> arr) {
		super(arr);
	}

	@Override
	public void Insert(Integer x) {
		// TODO Auto-generated method stub
		heap_size += 1;
                array.set(heap_size, java.lang.Integer.MIN_VALUE);
                IncreaseKey(x, heap_size);
	}

	@Override
	public Integer Maximum() {
		return array.get(0);
	}

	@Override
	public Integer ExtractMax() {
                if(heap_size<1){
                    System.out.println("Heap Underflow");
                    return null;
                }
                Integer max = array.get(0);
                array.set(0, array.get(heap_size));
                heap_size = heap_size - 1;
                MaxHeapify(array, 0);
                
		return max;
	}

	@Override
	public void IncreaseKey(Integer x, int k) {
		// TODO Auto-generated method stub
		if (x < array.get(k)){
                    System.out.println("New key is smaller than current key");
                }
                array.set(k, x);
                while(k > 1 && (array.get(Parent(k))<array.get(k))){
                    Integer temp = array.get(k);
                    array.set(k, array.get(Parent(k)));
                    array.set(Parent(k) , temp);
                    k = Parent(k);
                }
                
	}


}
