package sorts;

import java.util.List;
import utils.ArrayUtils;

public class QuickSort implements Sort {

	@Override
	public <T extends Comparable<? super T>> void sort(List<T> list) {
		devideAndsort(list, 0, list.size() - 1);

	} 
	
	<T extends Comparable<? super T>> void devideAndsort(List<T> list, int l, int r) {
		
		if (l >= r) {
			return;
		}
		int pivot = l;
		int lIdx = l+1;
		int rIdx = r;
		
		while(lIdx <= rIdx) {
			if(list.get(pivot).compareTo(list.get(lIdx)) <= 0) {
				ArrayUtils.swap(list, lIdx, rIdx);
				rIdx--;
			}else {
				lIdx++;
			}
			
		}
		
		ArrayUtils.swap(list, pivot, rIdx);
		
		pivot = rIdx;
		
		devideAndsort(list, l, pivot -1);
		devideAndsort(list, pivot+1, r);
		
		
	}

}
