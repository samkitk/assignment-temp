

import java.util.ArrayList;

public class MinPriorityQueue extends MinHeap implements MinPriorityQueueIN<Integer> {
        int flag = 0;
	public MinPriorityQueue(ArrayList<Integer> arr) {
		super(arr);
		
	}

	@Override
	public void Insert(Integer x) {
		// IntegerODO Auto-generated method stub
            array.set(heap_size - 1, java.lang.Integer.MAX_VALUE);
            DecreaseKey(x, heap_size - 1);
            heap_size++;
            if(flag == 0) System.out.println("Successfully inserted value in min heap with all properties satisfied");
	}

	@Override
	public Integer Minimum() {
		return array.get(0);
	}

	@Override
	public Integer ExtractMin() {
            Integer min = null;
            if(heap_size-1 < 1) System.out.println("Heap Underflow!");
            else
            {
                min = array.get(0);
                array.set(0, array.get(heap_size-1));
                heap_size--;
                MinHeapify(array, 0);
            }
            return min;
	}

	@Override
	public void DecreaseKey(int x, Integer k) {
            if(x > array.get(k))
            {
                System.out.println("New Key is larger than current key");
                flag = 1;
            }
            else
            {
                array.set(k, x);
                while(k > 1 && array.get(Parent(k)) < array.get(k))
                {
                    Integer temp = array.get(k);
                    array.set(k, array.get(Parent(k)));
                    array.set(Parent(k), temp);
                    k = Parent(k);
                }
            }
	}

}
