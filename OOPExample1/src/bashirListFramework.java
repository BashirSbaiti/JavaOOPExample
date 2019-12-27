
public abstract class bashirListFramework<E> {
	protected int SIZE;
	protected E[] data;
	
	public bashirListFramework(int SIZE) {
		this.SIZE = SIZE;
		data = (E[]) new Object[SIZE];
	}
	
	public abstract void insert(E element, int index);  // ABSTRACTION: these methods are abstracted because they require
	public abstract void insert(E element);				// different implementations for dynamically and non-dynamically sized data structures 
	
	// remove element, no bounds checking 
	public void remove(E element) {
		int index = find(element);
		for(int i = index-1; i<SIZE; i++) {
			data[i]=data[i-1];
		}
	}

	// remove element at index, no bounds checking 
	public void removeAt(int index) {
		for(int i = index-1; i<SIZE; i++) {
			data[i]=data[i-1];
		}
	}
	
	// returns index of element, -1 is element not in list
	public int find(E element) {
		for(int i = 0; i<SIZE; i++) {
			if(data[i]==element) {
				return i;
			}
		}
		return -1;
	}
	// returns if array is full of null values
	public boolean isEmpty() {
		for(int i = 0; i<SIZE; i++) {
			if(data[i]!=null) {
				return false;
			}
		}
		return true;
	}
	
	
	// THESE METHODS AND THEIR IMPLEMENTATIONS ARE THE SAME BETWEEN ALL CLASSES
	// as there is no differences between the required implementations for each class
	// so the need only be implemented once in the parent
	
	// set value at index to element
	public void set(int index, E element) {
		data[index]=element;
	}
	
	// returns element at index
	public E get(int index) {
		return data[index];
	}
	
	
	
}
