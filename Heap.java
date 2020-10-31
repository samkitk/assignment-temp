package heap;

import java.util.ArrayList;

public class Heap<T> {
	
    
	protected ArrayList<T> array = new ArrayList<T>();
	protected int heap_size;
	
	public int Parent(int i) {
		return i/2;		
}


public int Left(int i) {
	return 2*i;
}


public int Right(int i) {
	return 2*i+1;
}

	
	
	
}
