package practice.programcreek;

import utils.ArrayUtils;

public class RotateArray {
	
	public static void simpleRotate(int[] arr, int k, boolean right) {
		for(int i = 0; i < k; i++) {
			if (right) {
				int lastElem =  arr[arr.length -1] ;
				for(int j = arr.length-1; j >0 ; j--) {
					arr[j] = arr[j-1];
				}
				arr[0] = lastElem;
			} else {
				int firstElem =  arr[0];
				for(int j = 0; j < arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
				arr[arr.length -1] = firstElem;
			}
		}
	}
	
	public static void efficientRotate(int[] arr, int k, boolean right) {
		if(right) {

			ArrayUtils.flip(arr, 0, arr.length - k-1);
			ArrayUtils.flip(arr, arr.length - k, arr.length-1);
			ArrayUtils.flip(arr, 0, arr.length-1);
			
		}else {

			ArrayUtils.flip(arr, 0, k-1);
			ArrayUtils.flip(arr, k, arr.length-1);
			ArrayUtils.flip(arr, 0, arr.length-1);
			
		}
	}
}
