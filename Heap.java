import java.util.ArrayList;

public class Heap<Integer> {
    protected ArrayList<Integer> array = new ArrayList<Integer>();
    protected int heap_size;

    public int Parent(int i) {
        return i/2;
    }


    public int Left(int i) {
	return 2*i;
    }


    public int Right(int i) {
	return (2*i) + 1;
    }
}
