package datastructures;

public interface Stack<T> {
	public  void push(T item);
	public T pop();
	public T peak();
	public  int size();
	public boolean isEmpty();
}
