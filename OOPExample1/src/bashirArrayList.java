
public class bashirArrayList<E> extends bashirListFramework<E> implements dynamicSizing<E> {
	private int capacity;
	private int size;
	
	public bashirArrayList(int SIZE) {
		super(SIZE);
		capacity = SIZE;
	}


	public void pushBack(E element) {
		data = checkCapacity(data);
		data[size]=element;
		size++;
	}

	public E[] checkCapacity(E[] data) {
		if(size>=capacity) {
			E[] data2 = (E[])new Object[capacity*2];
			capacity*=2;
			for(int i=0; i<data.length;i++) {
				data2[i]=data[i];
			}
			return data2;
		}
		else {
			return data;
		}
	}

	public void insert(E element, int index) {
		size++;
		for(int i = size-1; i>index; i--) {
			data[i] = data[i-1];
		}
		data[index] = element;
	}
	public void insert(E element) {
		pushBack(element);
	}

	public void remove(E element) {
		for(int i = find(element); i<size; i++) {
			data[i]=data[i+1];
		}
		size--;
	}

	public void removeAt(int index) {
		for(int i = index; i<size; i++) {
			data[i]=data[i+1];
		}
		size--;
	}

	public int size() {
		return size;
	}

}
