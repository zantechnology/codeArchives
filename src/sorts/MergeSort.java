package sorts;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {

	@Override
	public <T extends Comparable<? super T>> void sort(List<T> list) {
		devideAndsort(list, 0, list.size() - 1);

	} 
	
	<T extends Comparable<? super T>> void devideAndsort(List<T> list, int l, int r) {
		
		if (l == r) return;
		
		int q = (l + r)/2;
		devideAndsort(list, l, q);
		devideAndsort(list, q+1, r);
		merge(list, l,q,r);
		
		
	}
	
	<T extends Comparable<? super T>> void merge(List<T> list, int l, int q, int r){
		List<T> left = new ArrayList<>(q-l + 1);
		List<T> right = new ArrayList<>(r - q);
		
		for (int i = l; i <=  q; i++) {
			//left.set(i - l, list.get(i));
			left.add(list.get(i));
		}
		for (int i =  q + 1; i <=  r; i++) {
			//right.set(i - q - 1, list.get(i));
			right.add(list.get(i));
		}
		
		int lIdx = 0;
		int rIdx = 0;
		for (int i = l; i <=  r; i++) {
			if(lIdx == left.size()) {
				list.set(i, right.get(rIdx++));
				continue;
			}
			
			if(rIdx == right.size()) {
				list.set(i, left.get(lIdx++));
				continue;
			}
			
			if (left.get(lIdx).compareTo(right.get(rIdx)) < 0 ) {
				list.set(i, left.get(lIdx++));
			}else {
				list.set(i, right.get(rIdx++));
			}
		}
		
		
	}

}
