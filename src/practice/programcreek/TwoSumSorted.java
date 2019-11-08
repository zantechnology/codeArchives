package practice.programcreek;

public class TwoSumSorted {
	public static int [] getTwoSum(int[] arr, int target) throws Exception {
		return getTwoSum(arr, 0, target);
		
	}
	
	
	public static int [] getTwoSum(int[] arr, int startingPoint, int target) throws Exception {
		if(arr == null || arr.length - startingPoint < 2)
			throw new Exception("Input array must contain at least 2 elements");
		
		for(int i = startingPoint; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				throw new Exception("Input array is not sorted");
			}
		}
		
		int start = startingPoint ;
		int end = arr.length - 1;
		
		while(start < end) {
			int sum = arr[start] + arr[end]; 
			if (sum == target) {
				return new int[] {start, end};
			}else if(sum > target) {
				end--;
			}else {
				start++;
			}
		}
		
		return null;
		
	}
}
