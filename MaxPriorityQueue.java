

import java.util.ArrayList;

public class MaxPriorityQueue extends MaxHeap implements MaxPriorityQueueIN<Integer> {
        int flag = 0;
	public MaxPriorityQueue(ArrayList<Integer> arr) {
            super(arr);
	}

	@Override
	public void Insert(Integer x) {
            // TODO Auto-generated method stub
            array.set(heap_size - 1, java.lang.Integer.MIN_VALUE);
            IncreaseKey(x, heap_size - 1);
            heap_size++;
            if(flag == 0) System.out.println("Successfully inserted value in max heap with all the properties satisfied");
	}

	@Override
	public Integer Maximum() {
            // TODO Auto-generated method stub
            return array.get(0);
	}

	@Override
	public Integer ExtractMax() {
            // TODO Auto-generated method stub
            Integer max = null;
            if(heap_size < 1) System.out.println("Heap Underflow!");
            else
            {
                max = array.get(0);
                array.set(0, array.get(heap_size));
                heap_size--;
                MaxHeapify(array, 0);
            }
            return max;
	}

	@Override
	public void IncreaseKey(Integer x, int k) {
            // TODO Auto-generated method stub
            if(x < array.get(k))
            {
                System.out.println("New Key is smaller than current key");
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
