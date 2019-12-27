
public class bashirList<E> extends bashirListFramework<E> {

	// INHERITANCE: this class can use methods from the parent (bashirListFramework)
	// super() in constructor and extends on first line indicates inheritance
	public bashirList(int SIZE) {
		super(SIZE);
	}

	// inserts element at index
	// ABSTRACTION: Implementation of abstract method, without bounds checking
	public void insert(E element, int index) {
		for(int i = SIZE-2; i>index; i--) {
			data[i] = data[i-1];
		}
		data[index] = element;
	}

	// COMPILE TIME POLYMORPHISM: overload of insert function
	// assume if index is not specified that a pushBack operation is intended
	public void insert(E element) {
		data[find(null)]=element;
	}

}
