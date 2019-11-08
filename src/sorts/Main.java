package sorts;

import java.util.ArrayList;
import java.util.List;
import utils.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(13);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(10);
		list.add(15);
		list.add(9);
		
		//Sort s = new InsertionSort();
		//Sort s = new BubbleSort();
		//Sort s = new MergeSort();
		//Sort s = new QuickSort();
		Sort s = new HeapSort();
		s.sort(list);
		
		ArrayUtils.printList(list);
	}
	
	

}
