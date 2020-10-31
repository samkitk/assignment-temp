package heap;

public interface MaxPriorityQueueIN <T> {
	
	public void Insert(T x);
	public T Maximum();
	public T ExtractMax();
	public void IncreaseKey(int x, T k);
	
}
