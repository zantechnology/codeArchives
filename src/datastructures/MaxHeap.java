package datastructures;

import java.util.ArrayList;
import java.util.List;
import utils.HeapUtils;
import utils.ArrayUtils;

public class MaxHeap<T extends Comparable<? super T>> implements Heap<T>{
	
	List<T> list;
	
	public MaxHeap() {
		this.list = new ArrayList<>();
	}

	@Override
	public void insert(T item) {
		this.list.add(item);
		for(int i = this.list.size()/2; i >= 0; i--) {
			HeapUtils.maxHeapify(list, this.list.size(), i);
		}
	}

	@Override
	public T remove() {
		if (this.list.size() < 1)
			return null;
		T t = this.list.remove(0);
		if (this.list.size() > 0 ) {
			T newRoot = this.list.remove(this.list.size() -1);
			this.list.add(0, newRoot);
			HeapUtils.maxHeapify(this.list, this.list.size(), 0);
		}
		return t;
	}

	@Override
	public T examine() {
		if (this.list.size() < 1)
			return null;
		T t = this.list.get(0);
		return t;
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public boolean isEmpty() {
		return this.list.size() == 0;
	}
	
	@Override
	public String toString() {
		return ArrayUtils.listToString(this.list);
	}
	

}
