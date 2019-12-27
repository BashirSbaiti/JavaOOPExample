
public interface dynamicSizing<E> {
	
	public void pushBack(E element);
	
	public E[] checkCapacity(E[] data); //TODO reconsider scope
	
	public int size();
}
