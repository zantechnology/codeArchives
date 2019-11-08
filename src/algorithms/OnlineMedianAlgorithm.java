package algorithms;

import java.util.ArrayList;
import java.util.List;

import datastructures.MaxHeap;
import datastructures.MinHeap;

public class OnlineMedianAlgorithm<T extends Comparable<? super T>>  {
	MinHeap<T> minHeap;
	MaxHeap<T> maxHeap;
	
	public OnlineMedianAlgorithm() {
		this.minHeap  = new MinHeap<>();
		this.maxHeap  = new MaxHeap<>();
	}
	
	public void insert(T item) {
		
		if (minHeap.size() < 1) {
			this.minHeap.insert(item);
			return;
		}
		
		
		if(item.compareTo(this.minHeap.examine()) < 0) {
			this.maxHeap.insert(item);
		}else {
			this.minHeap.insert(item);
		}
		
		balance();
	}
	
	public List<T> getMedian() {
		List<T> list = new ArrayList<>();
		
		if(minHeap.size() < maxHeap.size()) {
			list.add(maxHeap.examine());
		}
		
		if(minHeap.size() > maxHeap.size()) {
			list.add(minHeap.examine());
		}
		
		if(minHeap.size() == maxHeap.size()) {
			list.add(minHeap.examine());
			list.add(maxHeap.examine());
		}
		
		return list;
	}
	
	void balance() {
		if(minHeap.size() + 1 < maxHeap.size()) {
			T t = maxHeap.remove();
			minHeap.insert(t);
		}
		
		if(maxHeap.size() + 1 < minHeap.size()) {
			T t = minHeap.remove();
			maxHeap.insert(t);
		}
	} 

}
