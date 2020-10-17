
public interface MaxPriorityQueueIN <T> {
	
	public void Insert(T x);
	public T Maximum();
	public T ExtractMax();
	public void IncreaseKey(T x, int k);
	
}
