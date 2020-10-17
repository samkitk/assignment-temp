

public interface MinPriorityQueueIN<T> {
	
	public void Insert(T x);
	
	public T Minimum();
	
	public T ExtractMin();
	
	public void DecreaseKey(int x, T k);

}
