package sorts;

import java.util.List;
import utils.ArrayUtils;
import utils.HeapUtils;

public class HeapSort implements Sort {

	@Override
	public <T extends Comparable<? super T>> void sort(List<T> list) {
		
		int size = list.size();
		
		for(int i = size/2; i >= 0; i--) {
			HeapUtils.maxHeapify(list, size, i);
		}
		
		for(int i = size - 1; i >= 0; i--) {
			ArrayUtils.swap(list, 0, i);
			size--;
			HeapUtils.maxHeapify(list, size, 0);
		}
		

	} 
	
	<T extends Comparable<? super T>> void maxHeapify(List<T> list, int size, int i) {
		int lcIdx = i * 2 + 1; 
		int rcIdx = i * 2 + 2; 
		int largest = i;
		
		if (lcIdx < size && list.get(largest).compareTo(list.get(lcIdx)) < 0) {
			largest = lcIdx;
		}
		
		if (rcIdx < size && list.get(largest).compareTo(list.get(rcIdx)) < 0) {
			largest = rcIdx;
		}
		
		if (i != largest) {
			ArrayUtils.swap(list, largest, i);
			maxHeapify(list, size, largest);
		}
		
	}

}
