package practice.programcreek;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int [] getTwoSum(int[] arr, int target) throws Exception {

		if(arr == null || arr.length < 2)
			throw new Exception("Input array must contain at least 2 elements");
		Map<Integer, Integer> targetMap = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(targetMap.containsKey(arr[i])) {
				return new int[] {targetMap.get(arr[i]).intValue(),i};
			}else {
				targetMap.put(target- arr[i], i);
			}
		}
		
		return null;
		
	}
}
