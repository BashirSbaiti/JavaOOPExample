
public abstract class bashirListFramework<E> {
	protected int SIZE;
	protected E[] data;
	
	public bashirListFramework(int SIZE) {
		this.SIZE = SIZE;
		data = (E[]) new Object[SIZE];
	}
	
	public abstract void insert(E element, int index);
	public abstract void insert(E element);
	public abstract void remove(E element);
	public abstract void removeAt(int index);
	
	public void set(int index, E element) {
		data[index]=element;
	}
	
	public boolean isEmpty() {
		for(int i = 0; i<SIZE; i++) {
			if(data[i]!=null) {
				return false;
			}
		}
		return true;
	}
	
	public int find(E element) {
		for(int i = 0; i<SIZE; i++) {
			if(data[i]==element) {
				return i;
			}
		}
		return -1;
	}
	
	public E get(int index) {
		return data[index];
	}
	
	
	
}
