package util;

public interface ArrayListADT<T> {
	
	// this method return the element by adding the value by user 
	public void add(T element);
	
	//pure method for remove the last element from the list
	public void remove();
	
	//boolean method that check is the list empty
	public boolean isEmpty();
	
	//integer method for checking the size of the list
	public int size();
	
	//get the specific element by the specific index
	public T get(int index);
}
