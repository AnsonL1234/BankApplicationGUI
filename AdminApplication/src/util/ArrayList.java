package util;

public class ArrayList<T> implements ArrayListADT<T> {

	
	private final int DEFAULT_CAPACITY = 100;
	private int open; //indicate the open source
	private T[] array;
	
	//initialize the slot
	public ArrayList() {
		open = 0;
		array = (T[])(new Object[DEFAULT_CAPACITY]);
	}
	
	//initial the slot with the parameter 
	public ArrayList(int initialCapacity) {
		open = 0;
		array = (T[])(new Object[initialCapacity]);
	}
	
	
	public void add(T element) {
		
		//add the element to the array and create 1 empty slot that keep tracking 
		array[open] = element;
		open++; 
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("The list is empty");
		} else {
			open--;
			T result = array[open];
			array[open] = null;
		}
	}
	
	public boolean isEmpty() {
		return (open == 0);
	}
	
	public int size() {
		return open;
	}
	
	//return the index by the specific number input
	public T get(int index) {
		if (index < 0 || index >= size()) 
			return null;
		else 
			return array[index];
	}
	
	//to String method that displaying everything on the list
	public String toString() {
		String result = "";
		for (int count = 0; count < open; count++) {
			result = result + array[count].toString();
		}
		
		return result;
	}
	
	
}
