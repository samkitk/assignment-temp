package heap;

import java.util.ArrayList;

public class MaxPriorityQueue extends MaxHeap implements MaxPriorityQueueIN<Integer> {

	public MaxPriorityQueue(ArrayList<Integer> arr) {
		super(arr);
	}

	@Override
	public void Insert(Integer x) {
            array.set(heap_size-1,java.lang.Integer.MIN_VALUE);
            IncreaseKey(heap_size-1,x);   
            heap_size=heap_size+1;               
	}

	@Override
	public Integer Maximum() {
 
            return array.get(0);
	}

	@Override
	public Integer ExtractMax() {
           if(heap_size-1<1){
               System.out.println("heap underflow");
               return null;
            }
            Integer max=array.get(0);
            array.set(0,array.get(heap_size-1));
            heap_size=heap_size-1;
            MaxHeapify(array,0) ;                   
		return array.get(0);
	}

	@Override
	public void IncreaseKey(int x, Integer k) {
            if(k<array.get(x)){
                System.out.println("new key is smaller than current key");
            }
            array.set(x, k);
            while((x>1)&& array.get(Parent(x))<array.get((x))){
                int temp;
                temp=array.get(x);
                array.set(x,array.get(Parent(x)));
                array.set(Parent(x), temp);
                x=Parent(x);
            }
	}


}
