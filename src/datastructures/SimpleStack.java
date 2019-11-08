package datastructures;

import java.util.ArrayList;
import java.util.List;

import utils.ArrayUtils;

public class SimpleStack<T>  implements Stack<T>{
	
	List<T> arr;
	
	public SimpleStack() {
		this.arr = new ArrayList<>();
	}

	@Override
	public void push(T item) {
		this.arr.add(item);
		
	}

	@Override
	public T pop() {
		if(this.arr.isEmpty())
			return null;
		
		return this.arr.remove(this.arr.size() - 1);
	}

	@Override
	public T peak() {
		if(this.arr.isEmpty())
			return null;
		
		return this.arr.get(this.arr.size() - 1);
	}

	@Override
	public int size() {
		return this.arr.size();
	}

	@Override
	public boolean isEmpty() {
		return this.arr.isEmpty();
	}
	
	@Override
	public String toString() {
		return ArrayUtils.listToString(this.arr);
	}

}
