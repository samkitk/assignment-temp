package heap;

import java.util.ArrayList;

public class MinHeap extends Heap<Integer> {

	

public MinHeap(ArrayList<Integer> arr) {
	array = arr;
	heap_size = array.size();
	
}
	
public void BuildMinHeap(ArrayList<Integer> arr) {
        for(int i=arr.size()/2; i>0;i--){
            MinHeapify(arr,i);
        }
}

public void MinHeapify(ArrayList<Integer> arr, int i) {
    int smallest,temp;
    int l=Left(i);
    int r=Right(i);
    if((l<=heap_size-1) && (arr.get(l)<arr.get(i))){
        smallest=l;
    }
    else{ 
        smallest=i;
    }
    if((r<=heap_size-1) && (arr.get(r)<arr.get(smallest))){
        smallest=r;
    }
    if(smallest!=i){
        temp=arr.get(i);
        arr.set(i,arr.get(smallest));
        arr.set(smallest, temp);
        MinHeapify(arr,smallest);
        
    }
}

	
}
