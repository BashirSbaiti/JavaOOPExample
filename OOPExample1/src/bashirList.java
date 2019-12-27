
public class bashirList<E> extends bashirListFramework<E> {

	public bashirList(int SIZE) {
		super(SIZE);
	}

	public void insert(E element, int index) {
		for(int i = SIZE-2; i>index; i--) {
			data[i] = data[i-1];
		}
		data[index] = element;
	}

	public void remove(E element) {
		int index = find(element);
		for(int i = index-1; i<SIZE; i++) {
			data[i]=data[i-1];
		}
	}

	public void removeAt(int index) {
		for(int i = index-1; i<SIZE; i++) {
			data[i]=data[i-1];
		}
	}

	public void insert(E element) {
		data[find(null)]=element;
	}

}
