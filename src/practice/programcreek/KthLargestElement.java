package practice.programcreek;

public class KthLargestElement {
	public static int findKthLargestElement(int[] arr, int k) throws Exception {
		
		if(k > arr.length)
			throw new Exception("Array has less than k elements");
		int[] curKLargest = new int[k];
		
		int smallestIxd = 0;
		
		for(int i = 0 ; i < k; i++) {
			curKLargest[i] = arr[i];
			
			if(curKLargest[i] < curKLargest[smallestIxd])
				smallestIxd = i;
		}
		
		for(int i = k ; i < arr.length; i++) {
			if(curKLargest[smallestIxd] < arr[i]) {
				curKLargest[smallestIxd] = arr[i];
				for(int j = 0 ; j < k; j++) {
					if(curKLargest[j] < curKLargest[smallestIxd])
						smallestIxd = j;
				}
			}
				
		}
		return curKLargest[smallestIxd];
	}
}
