
public interface dynamicSizing<E> { // Interface only to be implemented by classes with dynamic sizing
									// these methods don't make as much sense for classic arrays of a fixed size
	
	public void pushBack(E element);
	
	public int size();
}
