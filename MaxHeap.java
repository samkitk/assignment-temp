package heap;

import java.util.ArrayList;

public class MaxHeap extends Heap<Integer> {

public MaxHeap(ArrayList<Integer> arr) {
	array = arr;
	heap_size = array.size();
	
}
	
public void BuildMaxHeap(ArrayList<Integer> arr) {
        for(int i=arr.size()/2; i>0;i--){
            MaxHeapify(arr,i);
        }
}

public void MaxHeapify(ArrayList<Integer> arr, int i) {
    int largest,temp;
    int l=Left(i);
    int r=Right(i);
    if((l<=heap_size-1) && (arr.get(l)>arr.get(i))){
        largest=l;
    }
    else{
        largest=i;
    }
    if((r<=heap_size-1) && (arr.get(r)>arr.get(largest))){
        largest=r;
    }
    if(largest!=i){
        temp=arr.get(i);
        arr.set(i,arr.get(largest));
        arr.set(largest, temp);
        MaxHeapify(arr,largest);
        
    }
}



}
