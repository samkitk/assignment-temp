package heap;

import java.util.ArrayList;

public class MinPriorityQueue extends MinHeap implements MinPriorityQueueIN<Integer> {

	public MinPriorityQueue(ArrayList<Integer> arr) {
		super(arr);
		
	}

	@Override
	public void Insert(Integer x) {
		// TODO Auto-generated method stub
		heap_size += 1;
                array.set(heap_size, java.lang.Integer.MAX_VALUE);
                DecreaseKey(x, heap_size);
	}

	@Override
	public Integer Minimum() {
		// TODO Auto-generated method stub
		return array.get(0);
	}

	@Override
	public Integer ExtractMin() {
		if(heap_size<1){
                    System.out.println("Heap Underflow");
                    return null;
                }
                Integer min = array.get(0);
                array.set(0, array.get(heap_size));
                heap_size = heap_size - 1;
                MinHeapify(array, 0);
                
		return min;
	}

	@Override
	public void DecreaseKey(Integer x, int k) {
		// TODO Auto-generated method stub
                if (x < array.get(k)){
                    System.out.println("New key is larger than current key");
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
