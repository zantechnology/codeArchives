package sorts;

import java.util.List;
import utils.ArrayUtils;


public class InsertionSort implements Sort{

	@Override
	public <T extends Comparable<? super T>> void sort(List<T> list) {
		for (int i =0 ; i < list.size(); i++) {
			for (int j = i; j > 0 ; j--) {
				T jthVal =  list.get(j);
				T jMin1thVal = list.get(j-1);
				if (jthVal.compareTo(jMin1thVal) < 0) {
					ArrayUtils.swap(list, j, j-1);
				}
			}
		}
		
	}
}
