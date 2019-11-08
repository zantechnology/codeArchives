package sorts;

import java.util.List;
import utils.ArrayUtils;

public class BubbleSort implements Sort {

	@Override
	public <T extends Comparable<? super T>> void sort(List<T> list) {
		boolean done;
		do {
			done = true;
			for(int i = list.size() - 1; i >  0; i --) {
				for (int j = 0; j < i; j++) {
					T jthVal = list.get(j);
					T jPlus1thVal =  list.get(j+1);
					if (jthVal.compareTo(jPlus1thVal) > 0) {
						ArrayUtils.swap(list, j, j+1);
						done = false;
					}
				}
				
			}
			
		}while(!done);

	}

}
