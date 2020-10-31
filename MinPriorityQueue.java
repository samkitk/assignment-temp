package heap;

import java.util.ArrayList;

public class MinPriorityQueue extends MinHeap implements MinPriorityQueueIN<Integer> {

	public MinPriorityQueue(ArrayList<Integer> arr) {
		super(arr);
	}

	@Override
	public void Insert(Integer x) {
            array.set(heap_size-1,java.lang.Integer.MIN_VALUE);
            DecreaseKey(heap_size-1,x);	
            heap_size=heap_size+1;
	}

	@Override
	public Integer Minimum() {

            return array.get(0);
	}

	@Override
	public Integer ExtractMin() {
           if(heap_size<1){
               System.out.println("heap underflow");
               return null;
            }
            Integer min=array.get(0);
            array.set(0,array.get(heap_size-1));
            heap_size=heap_size-1;
            MinHeapify(array,0) ;                   
		return array.get(0);
	}

	@Override
	public void DecreaseKey(int x, Integer k) {
            if(k<array.get(x)){
                System.out.println("new key is larger than current key");
            }
            array.set(x, k);
            while((x>1)&& array.get(Parent(x))>array.get((x))){
                int temp;
                temp=array.get(x);
                array.set(x,array.get(Parent(x)));
                array.set(Parent(x), temp);
                x=Parent(x);
            }
	}
}
