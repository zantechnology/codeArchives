package sorts;

import java.util.ArrayList;
import java.util.List;
import utils.ArrayUtils;


public class SimpleSort{

	public static <T extends Comparable<? super T>> List<T>  sort(List<T> list, boolean keepOriginal) {
		List<T> workingList = list;
		
		if(keepOriginal) {
			workingList = new ArrayList<T>();
			for(T t: list) {
				workingList.add(t);
			}
		}
		
		for (int i =0 ; i < workingList.size(); i++) {
			for (int j = i; j > 0 ; j--) {
				T jthVal =  workingList.get(j);
				T jMin1thVal = workingList.get(j-1);
				if (jthVal.compareTo(jMin1thVal) < 0) {
					ArrayUtils.swap(workingList, j, j-1);
				}
			}
		}
		
		return workingList;
	}
	
	public static <T extends Comparable<? super T>> T[] sort(T[] arr, boolean keepOriginal) {
		T[] workingArr = arr;
		
		if(keepOriginal) {
			workingArr = ArrayUtils.arrayCopy(arr);
		}
		
		for (int i =0 ; i < workingArr.length; i++) {
			for (int j = i; j > 0 ; j--) {
				T jthVal =  workingArr[j];
				T jMin1thVal = workingArr[j-1];
				if (jthVal.compareTo(jMin1thVal) < 0) {
					ArrayUtils.swap(workingArr, j, j-1);
				}
			}
		}
		
		return workingArr;
	}
	
	public static int[] sort(int[] arr, boolean keepOriginal) {
		int[] workingArr = arr;
		
		if(keepOriginal) {
			workingArr = new int[arr.length];
			for(int i = 0 ; i < arr.length; i++) {
				workingArr[i] = arr[i];
			}
		}
		
		for (int i =0 ; i < workingArr.length; i++) {
			for (int j = i; j > 0 ; j--) {
				int jthVal =  workingArr[j];
				int jMin1thVal = workingArr[j-1];
				if (jthVal < jMin1thVal) {
					ArrayUtils.swap(workingArr, j, j-1);
				}
			}
		}
		
		return workingArr;
	}
}
