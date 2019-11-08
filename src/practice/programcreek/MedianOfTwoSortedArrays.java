package practice.programcreek;

public class MedianOfTwoSortedArrays {
	
	public static double findMedian(int[] arr1, int[] arr2) throws Exception {
		
		for(int i = 0; i < arr1.length - 1; i ++) {
			if (arr1[i] > arr1[i+1])
				throw new Exception("arr 1 is not properly sorted");
		}
		
		for(int i = 0; i < arr1.length - 1; i ++) {
			if (arr1[i] > arr1[i+1])
				throw new Exception("arr 1 is not properly sorted");
		}
		
		int totalSize = arr1.length + arr2.length;
		
		if(totalSize < 1)
			throw new Exception("both array cannot be empty");
		
		
		boolean even = totalSize % 2 == 0;
		
		int stopPoint = totalSize/2;
		
		
		if(arr1.length ==0) {
			if (even) {
				return (arr2[stopPoint - 1] + arr2[stopPoint])/2.0;
			}else {
				return arr2[stopPoint] * 1.0;
			}
		}
		
		if(arr2.length ==0) {
			if (even) {
				return (arr1[stopPoint - 1] + arr1[stopPoint])/2.0;
			}else {
				return arr1[stopPoint] * 1.0;
			}
		}
		
		int cntr1 = 0, cntr2  = 0, prev = 0, cur = 0;
		
		if(arr1[0] < arr2[0]) {
			cur  = arr1[0];
			cntr1++;
		}else {
			cur  = arr2[0];
			cntr2++;
		}
		
		for(int i =0 ; i < stopPoint; i++) {
			prev = cur;
			
			if(cntr1 >= arr1.length) {
				cur = arr2[cntr2++];
				continue;
			}
			
			if(cntr2 >= arr2.length) {
				cur = arr1[cntr1++];
				continue;
			}
			
			if(arr1[cntr1] < arr2[cntr2]) {
				cur = arr1[cntr1++];
			}else {
				cur = arr2[cntr2++];
			}
		}
		
		
		
		if(even) {
			return (cur+prev)/2.0;
			
		}else {
			
		}
		
		
		
		return cur;
	}

}
