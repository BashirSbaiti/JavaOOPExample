
public class bashirArrayList<E> extends bashirListFramework<E> implements dynamicSizing<E> {
	private int capacity;	// ENCAPSULATION: these variables don't need to be used outside this scope
	private int size = 0;	// so they are encapsulated in this class
	
	// INHERITANCE: this class can use methods from the parent (bashirListFramework)
	// super() in constructor and extends on first line indicates inheritance
	public bashirArrayList(int SIZE) {
		super(SIZE);
		capacity = SIZE;
	}

	// added element to end of list
	// implementation of method in interface, must implement this because it is a method that is best
	// suited for dynamically sized data structures
	public void pushBack(E element) {
		data = checkCapacity(data);
		data[size]=element;
		size++;
	}

	// doubles capacity if array is full (only to be called before new item is to be added)
	private E[] checkCapacity(E[] data) {
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

	// inserts element at index
	// ABSTRACTION: implementation of abstract method, with bounds checking
	public void insert(E element, int index) {
		data = checkCapacity(data);
		for(int i = size; i>index; i--) {
			data[i] = data[i-1];
		}
		data[index] = element;
		size++;
	}
	
	// COMPILE TIME POLYMORPHISM: overload of insert function
	// assume if index is not specified that a pushBack operation is intended
	public void insert(E element) {
		pushBack(element);
	}

	// RUMTIME POLYMORPHISM: override of remove from parent, 
	// as parent's implementation doesn't increment size
	public void remove(E element) {
		for(int i = find(element); i<size; i++) {
			data[i]=data[i+1];
		}
		size--;
	}
	
	// RUMTIME POLYMORPHISM: override of removeAt from parent, for same reason as above
	public void removeAt(int index) {
		for(int i = index; i<size; i++) {
			data[i]=data[i+1];
		}
		size--;
	}
	
	// RUMTIME POLYMORPHISM: override of find from parent, uses size rather than SIZE
	public int find(E element) {
		for(int i = 0; i<size; i++) {
			if(data[i]==element) {
				return i;
			}
		}
		return -1;
	}
	
	// returns if array is full of null values
	// RUMTIME POLYMORPHISM: override of find from parent, uses size rather than SIZE
	public boolean isEmpty() {
		for(int i = 0; i<size; i++) {
			if(data[i]!=null) {
				return false;
			}
		}
		return true;
	}

	// allows the encapsulated variable size to be accessed outside the class but not modified
	public int size() {
		return size;
	}
	

}
